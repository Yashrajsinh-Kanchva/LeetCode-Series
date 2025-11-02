public class lc53 {
    public static void main(String[] args) {
        Solution53 s=new Solution53();
        System.out.println(s.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
class Solution53 {
    public int maxSubArray(int[] nums) {
        // This solution is based on KADANE'S ALGORITHM
        int ans=nums[0];
        int maxEnd=nums[0];

        for(int i=1; i<nums.length; i++){
            maxEnd=Math.max(maxEnd+nums[i],nums[i]);
            ans=Math.max(ans,maxEnd);
        }

        return ans;
    }
}
