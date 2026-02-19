public class lc696 {
    public static void main(String[] args) {
        Solution696 s=new Solution696();
        System.out.println(s.countBinarySubstrings("00110011"));
    }
}
class Solution696 {
    public int countBinarySubstrings(String s) {
        int res = 0, prev = 0, strk = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) strk++;
            else {
                prev = strk;
                strk = 1;
            }
            if (strk <= prev) res++;
        }
        return res;
    }
}
