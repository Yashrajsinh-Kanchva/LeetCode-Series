public class lc268 {
    public static void main(String[] args) {
        Solution268 s=new Solution268();
        int[] nums={9,6,5,7,3,2,0,1,4};
        System.out.println(s.missingNumber(nums));
    }
}
class Solution268{
    public int missingNumber(int[] nums) {
        int expectedSum=0;
        for(int i=0; i<= nums.length; i++){
            expectedSum+=i;
        }
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        return expectedSum-sum;
    }
}