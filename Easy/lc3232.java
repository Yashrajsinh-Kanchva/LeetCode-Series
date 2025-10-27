public class lc3232 {
    public static void main(String[] args) {
        Solution3232 s=new Solution3232();
        System.out.println(s.canAliceWin(new int[]{1,2,3,4,10}));
        System.out.println(s.canAliceWin(new int[]{1,2,3,4,5,14}));
    }
}
class Solution3232 {
    public boolean canAliceWin(int[] nums) {
        int sum1=0, sum2=0;
        for (int num : nums) {
            if (num < 10)
                sum1 += num;
            else
                sum2 += num;
        }
        return sum1>sum2 || sum2>sum1;
    }
}
