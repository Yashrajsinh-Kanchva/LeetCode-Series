public class lc1689 {
    public static void main(String[] args) {
        Solution1689 s=new Solution1689();
        System.out.println(s.minPartitions("32"));
    }
}
class Solution1689 {
    public int minPartitions(String n) {
        int ans = 0;
        for (int i = 0; i < n.length(); ++i) {
            ans = Math.max(ans, n.charAt(i) - '0');
        }
        return ans;
    }
}