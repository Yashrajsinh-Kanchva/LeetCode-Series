public class leetcode1 {
    public static void main(String[] args) {
        Solution1 s=new Solution1();
        int[] ans=s.twoSum(new int[]{2,7,11,15},9);
        for(int n:ans)
            System.out.print(n+" ");
    }
}
class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
}