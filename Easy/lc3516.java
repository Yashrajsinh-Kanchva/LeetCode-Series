public class lc3516 {
    public static void main(String[] args) {
        Solution3516 s=new Solution3516();
        System.out.println(s.findClosest(2,7,4));
    }
}
class Solution3516 {
    public int findClosest(int x, int y, int z) {
        int distX = Math.abs(x - z);
        int distY = Math.abs(y - z);
        if (distX == distY) return 0;
        return (distX < distY) ? 1 : 2;
    }
}
