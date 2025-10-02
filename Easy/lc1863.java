public class lc1863 {
    public static void main(String[] args) {
        Solution1863 s=new Solution1863();
        System.out.println(s.subsetXORSum(new int[]{1,3}));
    }
}
class Solution1863 {
    public int subsetXORSum(int[] nums) {
        int sum = 0;
        int length = nums.length;

        for (int mask = 0; mask < (1 << length); mask++) {
            int xor = 0;
            for (int i = 0; i < length; i++) {
                if ((mask & (1 << i)) != 0) {
                    xor ^= nums[i];
                }
            }
            sum += xor;
        }
        return sum;
    }
}