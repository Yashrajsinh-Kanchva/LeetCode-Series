import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc2089 {
    public static void main(String[] args) {
        Solution2089 s=new Solution2089();
        int[] nums={1,2,5,2,3};
        System.out.println(s.targetIndices(nums, 2));
    }
}
class Solution2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i< nums.length; i++){
            if(nums[i]==target){
                ans.add(i);
            }
            if(nums[i]>target){
                break;
            }
        }
        return ans;
    }
}