public class lc3228 {
    public static void main(String[] args) {
        Solution3228 s=new Solution3228();
        System.out.println(s.maxOperations("110"));
    }
}
class Solution3228 {
    public int maxOperations(String s) {
        long ones = 0;
        long ans = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                ones++;
            }
            else {
                if (i + 1 == n || s.charAt(i + 1) == '1') {
                    ans += ones;
                }
            }
        }
        return (int)ans;
    }
}
