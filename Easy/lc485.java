public class lc485 {
    public static void main(String[] args) {
        Solution485 s=new Solution485();
        int[] nums={1,0,1,1,0,1};
        System.out.println(s.findMaxConsecutiveOnes(nums));
    }
}
class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int prevZero=-1;
        int max=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                max=Math.max(max, i -prevZero-1);
                prevZero= i;
            }
            if(i== nums.length-1 && nums[i]!=0){
                max=Math.max(max, (i+1)-prevZero-1);
            }
        }
        return max;
    }
}
