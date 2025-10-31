public class lc31 {
    public static void main(String[] args) {
        Solution31 s=new Solution31();
        s.nextPermutation(new int[]{1,1,5});
    }
}
class Solution31 {
    public void nextPermutation(int[] nums) {
        int l=nums.length;
        int pivot=-1;

        for(int i=l-2; i>-1; i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }

        if(pivot==-1){
            reverse(nums,0,l-1);
        }
        else{

            for(int i=l-1; i>pivot; i--){
                if(nums[i]>nums[pivot]){
                    int temp=nums[pivot];
                    nums[pivot]=nums[i];
                    nums[i]=temp;
                    break;
                }
            }
            reverse(nums, pivot+1, l-1);
        }

        //PRINTING ARRAY
//        for(int i:nums){
//            System.out.print(i+" ");
//        }
    }
    void reverse(int[] nums, int start, int end){
        while(start<end) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }
}
