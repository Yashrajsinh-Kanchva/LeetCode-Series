public class lc441 {
    public static void main(String[] args) {
        Solution441 s=new Solution441();
        System.out.println(s.arrangeCoins(8));
    }
}
class Solution441 {
    public int arrangeCoins(int n) {
        return (int)(Math.sqrt(1 + 8L * n) - 1) / 2;

        //another method but runtime is 8ms
//        int count = 0;
//        int required = 1;
//
//        while (n >= required) {
//            n -= required;
//            count++;
//            required++;
//        }
//
//        return count;
    }
}