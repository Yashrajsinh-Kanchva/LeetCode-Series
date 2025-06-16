public class lc162 {
    public static void main(String[] args) {
        Solution162 s=new Solution162();
        int[] nums={1,2,3,1};
        System.out.println(s.findPeakElement(nums));
    }
}
class Solution162 {
    public int findPeakElement(int[] nums) {
        int max=nums[0];
        int index=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]<max){
                return i-1;
            }
            else{
                max=nums[i];
                index=i;
            }
        }
        return index;
    }
}
