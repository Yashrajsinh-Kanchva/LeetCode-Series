public class lc1653 {
    public static void main(String[] args) {
        Solution1653 s=new Solution1653();
        System.out.println(s.minimumDeletions("aababbab"));
    }
}
class Solution1653 {
    public int minimumDeletions(String s) {
        int res = 0, b = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'b')
                b++;
            else if (b > 0) {
                res++;
                b--;
            }
        }

        return res;
    }
}