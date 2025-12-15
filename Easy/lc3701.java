public class lc3701 {
    public static void main(String[] args) {
        Solution3701 s=new Solution3701();
        System.out.println(s.alternatingSum(new int[]{1,3,5,7}));
    }
}
class Solution3701 {
    public int alternatingSum(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length; i++){
            if(i%2==0)
                sum+=nums[i];
            else
                sum-=nums[i];
        }
        return sum;
    }
}