import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc1200 {
    public static void main(String[] args) {
        Solution1200 s=new Solution1200();
        System.out.println(s.minimumAbsDifference(new int[]{4,2,1,3}));
    }
}
class Solution1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int l=arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<l-1; i++){
            min=Math.min(min,Math.abs(arr[i]-arr[i+1]));
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0; i<l-1; i++){
            if(arr[i+1]-arr[i]==min){
                ans.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return ans;
    }
}
