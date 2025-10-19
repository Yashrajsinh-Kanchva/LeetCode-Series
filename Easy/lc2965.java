public class lc2965 {
    public static void main(String[] args) {
        Solution2965 s=new Solution2965();
        int[][] a=new int[2][2];
        a[0][0]=1;
        a[0][1]=3;
        a[1][0]=2;
        a[1][1]=2;
        int[] ans=s.findMissingAndRepeatedValues(a);
        for(int n: ans)
            System.out.print(n+" ");
    }
}
class Solution2965 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int l= grid.length;
        int[] n=new int[l*l+1];
        int[] ans=new int[2];
        for(int[] i:grid){
            for(int j:i){
                n[j]++;
                if(n[j]==2)
                    ans[0]=j;
            }
        }
        for(int i=1; i<n.length; i++){
            if(n[i]==0)
                ans[1]=i;
        }
        return ans;
    }
}