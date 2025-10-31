public class lc922 {
    public static void main(String[] args) {
        Solution922 s=new Solution922();
        int[] ans=s.sortArrayByParityII(new int[]{4,2,5,7});
        for(int i:ans)
            System.out.print(i+" ");
    }
}
class Solution922 {
    public int[] sortArrayByParityII(int[] nums) {
        int l=nums.length;
        int even=0,odd=1;
        int[] ans=new int[l];
        for(int i:nums){
            if(i%2==0) {
                ans[even] = i;
                even+=2;
            }
            else{
                ans[odd] = i;
                odd+=2;
            }
        }
        return ans;
    }
}