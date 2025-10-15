public class lc2396 {
    public static void main(String[] args) {
        Solution2396 s=new Solution2396();
        System.out.println(s.isStrictlyPalindromic(12));
    }
}
class Solution2396 {
    public boolean isStrictlyPalindromic(int n) {
        // it’s mathematically impossible for any n >= 4 to be strictly palindrome number
        return false;
    }
}
