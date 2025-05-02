public class lc27 {
    public static void main(String[] args) {
        int[] nums={0,1,2,2,3,0,4,2};
        Solution27 obj=new Solution27();
        int k=obj.removeElement(nums, 2);
        System.out.println(k);
    }
}
class Solution27 {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}