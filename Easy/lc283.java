public class lc283 {
    public static void main(String[] args) {
        int nums[]={0,1,0,3,12};
        Solution283 s=new Solution283();
        s.moveZeroes(nums);
        for(int i=0; i<5; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
class Solution283 {
    public void moveZeroes(int[] nums) {
        // Method-1
//        int length=nums.length;
//        int[] result=new int[length];
//
//        int first=0, last=length-1;
//        for(int i=0; i<length; i++){
//            if(nums[i]!=0)
//                result[first++]=nums[i];
//            else
//                result[last--]=nums[i];
//        }
//
//        for(int i=0; i<length; i++){
//            nums[i]=result[i];
//        }

        int indexForZero=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[indexForZero++]=nums[i];
            }
        }
        for(int i=indexForZero; i<nums.length; i++){
            nums[i]=0;
        }
    }
}
