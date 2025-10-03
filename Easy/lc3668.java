public class lc3668 {
    public static void main(String[] args) {
        Solution3668 s=new Solution3668();
        int[] result=s.recoverOrder(new int[]{3,1,2,5,4}, new int[]{1,3,4});
        for(int n: result)
            System.out.print(n+", ");
    }
}
class Solution3668 {
    public int[] recoverOrder(int[] order, int[] friends) {
        int len= friends.length;
        int[] ans=new int[len];

        int j=0;
        for(int n:order){
            for(int k:friends) {
                if (n==k)
                    ans[j++] = n;
            }
        }
        return ans;
    }
}