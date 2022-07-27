import java.util.ArrayList;
import java.util.TreeSet;

public class MaximizeTheArray {
    public static ArrayList<Integer> maximizeTheArray(int [] arr1, int[] arr2, int n){
        ArrayList<Integer> ans = new ArrayList<>();
        TreeSet<Integer> ts = new TreeSet<>();

        for(int i=0; i<n; i++){
            ts.add(arr1[i]);
        }
        for(int i=0; i<n; i++){
            ts.add(arr1[i]);
        }
        while(ts.size()> n){
            ts.remove(ts.first());
        }
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
