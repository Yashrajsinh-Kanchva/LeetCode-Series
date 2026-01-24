import java.util.Arrays;

public class lc1877 {
    public static void main(String[] args) {
        Solution1877 s=new Solution1877();
        System.out.println(s.minPairSum(new int[]{3,5,2,3}));
    }
}
class Solution1877 {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int n = nums.length;

        for (int i = 0; i < n >> 1; i++)
            res = Math.max(res, nums[n - 1 - i] + nums[i]);

        return res;
    }
}