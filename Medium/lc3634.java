import java.util.Arrays;

public class lc3634 {
    public static void main(String[] args) {
        Solution3634 s=new Solution3634();
        System.out.println(s.minRemoval(new int[]{1,6,2,9},3));
    }
}
class Solution3634 {
    public int minRemoval(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);

        int window=0;
        int left=0;

        for(int right=0; right<n; right++){
            while (nums[right]>(long)nums[left]*k){
                left++;
            }
            window=Math.max(window, right-left+1);
        }

        return n-window;
    }
}