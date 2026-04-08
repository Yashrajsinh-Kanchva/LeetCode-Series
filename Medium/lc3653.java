public class lc3653 {
    public static void main(String[] args) {
        Solution3653 s=new Solution3653();
        System.out.println(s.xorAfterQueries(new int[]{1,1,1}, new int[][]{{0,2,1,4}}));
    }
}
class Solution3653 {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int i[]: queries){
            int idx=i[0];
            while(idx<=i[1]){
                long temp=(long)nums[idx]*i[3];
                nums[idx]=(int)(temp%1000000007);
                idx+=i[2];
            }
        }
        int ans=0;
        for(int i:nums){
            ans^=i;
        }

        return ans;
    }
}