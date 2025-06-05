public class lc1480 {
    public static void main(String[] args) {
        Solution1480 s=new Solution1480();
        int nums[]={1,2,3,4};
        int[] result=s.runningSum(nums);
        for(int n: result){
            System.out.print(n+" ");
        }
    }
}
class Solution1480 {
    public int[] runningSum(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            nums[i+1]+=nums[i];
        }
        return nums;
    }
}
