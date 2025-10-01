public class lc2221 {
    public static void main(String[] args) {
        Solution2221 s=new Solution2221();
        System.out.println(s.triangularSum(new int[]{1,2,3,4,5}));
    }
}
class Solution2221 {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        for (int j=n; j>0; j--){
            for (int i=1; i<j; i++){
                nums[i-1] = (nums[i-1]+nums[i])%10;
            }
        }
        int res = nums[0];
        return res;
    }
}
