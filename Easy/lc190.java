public class lc190 {
    public static void main(String[] args) {
        Solution190 s=new Solution190();
        System.out.println(s.reverseBits(43261596));
    }
}
class Solution190 {
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res <<= 1;
            res |= (n & 1);
            n >>>= 1;
        }
        return res;
    }
}