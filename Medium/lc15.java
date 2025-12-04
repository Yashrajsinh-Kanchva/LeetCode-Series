import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc15 {
    public static void main(String[] args) {
        Solution15 s=new Solution15();
        System.out.println(s.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int l=nums.length;
        for(int i=0; i<l-2; i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left=i+1;
            int right=l-1;

            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum<0)
                    left++;
                else if (sum>0)
                    right--;
                else{
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) left++;

                    while (left < right && nums[right] == nums[right + 1]) right--;
                }
            }
        }
        return ans;
    }
}