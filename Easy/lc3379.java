public class lc3379 {
    public static void main(String[] args) {
        Solution3379 s=new Solution3379();
        int[] ans=s.constructTransformedArray(new int[]{3,-2,1,1});
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
class Solution3379 {
    public int[] constructTransformedArray(int[] nums) {
        int l=nums.length;
        int[] ans=new int[l];

        for(int i=0; i<l; i++){
            if(nums[i]>0){
                int index=(nums[i]+i)%l;
                ans[i]=nums[index];
            }
            else if(nums[i]<0){
                int index=(i+nums[i])%l;
                if(index<0){
                    index=l+index;
                }
                ans[i]=nums[index];
            }
            else if(nums[i]==0){
                ans[i]=nums[i];
            }
        }
        return ans;
    }
}