import java.util.Arrays;

public class lc1984 {
    public static void main(String[] args) {
        Solution1984 s=new Solution1984();
        System.out.println(s.minimumDifference(new int[]{87063,61094,44530,21297,95857,93551,9918},6));
    }
}
class Solution1984 {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = nums[k - 1] - nums[0];
        for (int i = 0; i + k <= n; i++) {
            ans = Math.min(ans, nums[i + k - 1] - nums[i]);
        }
        return ans;
    }
}
