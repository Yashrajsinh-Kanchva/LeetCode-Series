public class lc1545 {
    public static void main(String[] args) {
        Solution1545 s=new Solution1545();
        System.out.println(s.findKthBit(3,1));
    }
}
class Solution1545 {
    public char findKthBit(int n, int k) {
        if (n == 1) return '0';

        int len = (1 << n) - 1;
        int mid = (len + 1) / 2;

        if (k == mid) return '1';
        if (k < mid) return findKthBit(n - 1, k);

        char c = findKthBit(n - 1, len - k + 1);
        return c == '0' ? '1' : '0';
    }
}