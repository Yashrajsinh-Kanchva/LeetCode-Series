public class lc29 {
    public static void main(String[] args) {
        Solution29 s=new Solution29();
        System.out.println(s.divide(10,3));
    }
}
class Solution29 {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1)
            return Integer.MAX_VALUE;
        return dividend/divisor;
    }
}