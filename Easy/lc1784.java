public class lc1784 {
    public static void main(String[] args) {
        Solution1784 s=new Solution1784();
        System.out.println(s.checkOnesSegment("1001"));
    }
}
class Solution1784 {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}