public class lc1975 {
    public static void main(String[] args) {
        Solution1975 s=new Solution1975();
        System.out.println(s.maxMatrixSum(new int[][]{{1,2,3},{-1,-2,-3},{1,2,3}}));
    }
}
class Solution1975 {
    public long maxMatrixSum(int[][] matrix) {
        long ans=0;
        int min=Integer.MAX_VALUE;
        int count=0;
        for(int[] i:matrix){
            for(int j:i){
                int k=Math.abs(j);
                min=Math.min(min,k);
                ans+=k;
                if(j<0)
                    count++;
            }
        }
        if(count%2==0){
            return ans;
        }
        ans=ans- 2L *min;
        return ans;
    }
}