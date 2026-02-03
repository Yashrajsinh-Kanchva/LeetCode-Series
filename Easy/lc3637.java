public class lc3637 {
    public static void main(String[] args) {
        Solution3637 s=new Solution3637();
        System.out.println(s.isTrionic(new int[]{1,3,5,4,2,6}));
    }
}
class Solution3637 {

    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int i = 1;
        while (i < n && nums[i - 1] < nums[i]) {
            i++;
        }
        int p = i - 1;
        while (i < n && nums[i - 1] > nums[i]) {
            i++;
        }
        int q = i - 1;
        while (i < n && nums[i - 1] < nums[i]) {
            i++;
        }
        int flag = i - 1;
        return (p != 0) && (q != p) && (flag == n - 1 && flag != q);
    }
}