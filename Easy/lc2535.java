public class lc2535 {
    public static void main(String[] args) {
        Solution2535 s=new Solution2535();
        int[] nums={1,15,6,3};
        System.out.println(s.differenceOfSum(nums));
    }
}
class Solution2535 {
    public int differenceOfSum(int[] nums) {
        int sum=0, digitSum=0;
        for (int num : nums) {
            int n = num;
            sum += n;
            while (n > 0) {
                int rem = n % 10;
                digitSum += rem;
                n /= 10;
            }
        }
        return Math.abs(sum-digitSum);
    }
}
