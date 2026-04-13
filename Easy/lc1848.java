public class lc1848 {
    public static void main(String[] args) {
        Solution1848 s=new Solution1848();
        System.out.println(s.getMinDistance(new int[]{1,2,3,4,5},5,3));
    }
}
class Solution1848 {
    public int getMinDistance(int[] nums, int target, int start) {
        int ans=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                ans=Math.min(Math.abs(i-start),ans);
            }
        }
        return ans;
    }
}