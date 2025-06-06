import java.util.Arrays;

public class lc164 {
    public static void main(String[] args) {
        int[] nums={3,6,9,1};
        Solution164 s=new Solution164();
        System.out.println(s.maximumGap(nums));
    }
}
class Solution164 {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        for(int i=nums.length-1; i>0; i--){
            if((nums[i]-nums[i-1])>max){
                max=nums[i]-nums[i-1];
            }
        }
        return max;
    }
}