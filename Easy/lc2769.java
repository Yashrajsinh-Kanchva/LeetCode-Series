public class lc2769 {
    public static void main(String[] args) {
        Solution2769 s=new Solution2769();
        System.out.println(s.theMaximumAchievableX(4,1));
    }
}
class Solution2769 {
    public int theMaximumAchievableX(int num, int t) {
        return num+t*2;
    }
}
