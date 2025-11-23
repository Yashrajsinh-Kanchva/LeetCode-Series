public class lc3754 {
    public static void main(String[] args) {
        Solution3754 s=new Solution3754();
        System.out.println(s.sumAndMultiply(10203004));
    }
}
class Solution3754 {
    public long sumAndMultiply(int n) {
        long sum = 0;
        String x = "";
        String s = n + "";
        for (char ch : s.toCharArray()) {
            if (ch != '0') {
                sum += (ch-'0');
                x += ch;
            }
        }
        if(x.isEmpty()) return 0;
        long x1 = Long.parseLong(x);
        return x1 * sum;
    }
}