import java.util.Arrays;

public class lc3467 {
    public static void main(String[] args) {
        Solution3467 s=new Solution3467();
        int[] ans=s.transformArray(new int[]{4,3,2,1});
        for(int n:ans){
            System.out.print(n+", ");
        }
    }
}
class Solution3467 {
    public int[] transformArray(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0)
                nums[i]=0;
            else
                nums[i]=1;
        }
        Arrays.sort(nums);
        return nums;
    }
}