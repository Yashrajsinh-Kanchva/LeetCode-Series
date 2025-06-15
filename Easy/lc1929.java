public class lc1929 {
    public static void main(String[] args) {
        Solution1929 s=new Solution1929();
        int[] nums={1,2,1};
        int[] ans=s.getConcatenation(nums);
        for(int n: ans){
            System.out.print(n+" ");
        }
    }
}
class Solution1929 {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n*2];
        for(int i=0; i<n; i++){
            ans[i]=ans[n+i]=nums[i];
        }
        return ans;
    }
}
