public class lc3264 {
    public static void main(String[] args) {
        Solution3264 s=new Solution3264();
        int[] ans=s.getFinalState(new int[]{2,1,3,5,6}, 5, 2);
        for(int n:ans)
            System.out.print(n+" ");
    }
}
class Solution3264 {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k!=0) {
            int min=Integer.MAX_VALUE;
            int index=0;
            for (int i = 0; i < nums.length; i++) {
                if (min > nums[i]) {
                    min = nums[i];
                    index = i;
                }
            }
            nums[index]*=multiplier;
            k--;
        }
        return nums;
    }
}
