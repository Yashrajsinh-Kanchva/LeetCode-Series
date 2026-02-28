public class lc1680 {
    public static void main(String[] args) {
        Solution1680 s=new Solution1680();
        System.out.println(s.concatenatedBinary(1));
    }
}
class Solution1680 {
    public int concatenatedBinary(int n) {
        final int MOD = 1_000_000_007;
        long res = 0;
        int bits = 0;

        for(int i=1; i<=n; i++){
            if((i & (i-1)) == 0) bits++;
            res = ((res<<bits) | i) % MOD;
        }
        return (int)res;
    }
}