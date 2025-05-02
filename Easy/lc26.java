class Solution26 {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[k]){
                k++;
                nums[k]=nums[i];
            }
        }
        return k+1;
    }
}
public class lc26{
    public static void main(String[] args) {
        int[] nums={0,1,1,1,2,2,3,3,4};
        Solution26 obj=new Solution26();
        int k=obj.removeDuplicates(nums);
        System.out.println(k);
    }

}