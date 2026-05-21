public class lc905 {
    public static void main(String[] args) {
        Solution905 s=new Solution905();
        int[] ans=s.sortArrayByParity(new int[]{3,1,2,4});
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
class Solution905 {
    public int[] sortArrayByParity(int[] nums) {
        int l=nums.length;
        int i=0;
        for(int j=0; j<l; j++){
            if(nums[j]%2==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }
        return nums;
    }
}