public class lc70 {
    public static void main(String[] args) {
        Solution70 s=new Solution70();
        System.out.println(s.climbStairs(5));
    }
}
class Solution70 {
    public int climbStairs(int n) {
        if(n<=2) return n;

        int prev1=1;
        int prev2=2;

        for(int i=3; i<=n; i++){
            int curr=prev1+prev2;
            prev1=prev2;
            prev2=curr;
        }

        return prev2;
    }
}