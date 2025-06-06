public class lc414 {
    public static void main(String[] args) {
        Solution414 s=new Solution414();
        int[] nums={1,1,2};
        System.out.println(s.thirdMax(nums));
    }
}
class Solution414 {
    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE, max2 = Long.MIN_VALUE, max3 = Long.MIN_VALUE;

        for (int num : nums) {
            if (num == max1 || num == max2 || num == max3) continue;

            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
        }

        return max3 == Long.MIN_VALUE ? (int) max1 : (int) max3;
    }
}
