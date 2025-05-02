public class lc35 {
    public static void main(String[] args) {
        Solution35 obj=new Solution35();
        int[] nums={3,6,7,8,10};
        int k=obj.searchInsert(nums, 11);
        System.out.println(k);
    }
}
class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int k=0;
        boolean b=true;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                k=i;b=false;
                break;
            }
        }
        if(b){
            if(nums[nums.length-1]<target){
                k=nums.length+1;
                return k;
            }
            for(int j=0; j<nums.length; j++){
                if(nums[j]<target && nums[j+1]>target){
                    k=j+1;
                    break;
                }   
            }
        }
        return k;
    }
}
