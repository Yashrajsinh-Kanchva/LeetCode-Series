public class lc338 {
    public static void main(String[] args) {
        Solution338 s=new Solution338();
        int[] ans=s.countBits(5);
        for(int i: ans)
            System.out.print(i+" ");
    }
}
class Solution338 {
    public int[] countBits(int n) {
//        int[] ans=new int[n+1];
//        for(int i=0; i<=n; i++){
//            String s=Integer.toBinaryString(i);
//            int count=0;
//            for(char ch:s.toCharArray()){
//                if(ch=='1')
//                    count++;
//            }
//            ans[i]=count;
//        }
//        return ans;

        int[] ans=new int[n+1];
        for(int i=0; i<=n; i++){
            ans[i]=Integer.bitCount(i);
        }
        return ans;
    }
}