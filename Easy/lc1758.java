public class lc1758 {
    public static void main(String[] args) {
        Solution1758 s=new Solution1758();
        System.out.println(s.minOperations("0100"));
    }
}
class Solution1758 {
    public int minOperations(String s) {
        int count = 0, n = s.length();
        for (int i = 0; i < n; i++)
            count += (s.charAt(i) ^ i) & 1;

        return Math.min(count, n - count);
    }
}