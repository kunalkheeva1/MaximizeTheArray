import java.util.ArrayList;
import java.util.TreeSet;

public class MaximizeTheArray {
    public static ArrayList<Integer> maximizeTheArray(int [] arr1, int[] arr2, int n){
        //get a tree set to sort the numbers and remove the duplicates
        ArrayList<Integer> ans = new ArrayList<>();
        TreeSet<Integer> ts = new TreeSet<>();

        //addition int treeSet
        for(int i=0; i<n; i++){
            ts.add(arr1[i]);
        }
        for(int i=0; i<n; i++){
            ts.add(arr1[i]);
        }

        //reduce the size to n
        while(ts.size()> n){
            ts.remove(ts.first());
        }


        //check the arr2 first and add in ans and remove from treeSet, then repeat it with arr1
        for(int i=0; i<n; i++){
            if(ts.contains(arr2[i])){
                ans.add(arr2[i]);
                ts.remove(arr2[i]);
            }
        }
        for(int i=0; i<n; i++){
            if(ts.contains(arr1[i])){
                ans.add(arr1[i]);
                ts.remove(arr1[i]);
            }
        }return ans;


    }
    public static void main(String[] args) {

    }
}
