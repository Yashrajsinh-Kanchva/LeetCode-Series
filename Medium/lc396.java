public class lc396 {
    public static void main(String[] args) {
        Solution396 s=new Solution396();
        System.out.println(s.maxRotateFunction(new int[]{4,3,2,6}));
    }
}
class Solution396{
    public int maxRotateFunction(int[] nums){
        int n = nums.length;
        long sum = 0, f = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            f += (long) i * nums[i];
        }

        long ans = f;
        for (int k = 1; k < n; k++) {
            f = f + sum - (long) n * nums[n - k];
            ans = Math.max(ans, f);
        }

        return (int) ans;
    }
}
