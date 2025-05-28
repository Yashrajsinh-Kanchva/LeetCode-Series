public class lc7 {
    public static void main(String[] args) {
        Solution7 s=new Solution7();
        System.out.println(s.reverse(-123));
    }
}
class Solution7 {
    public int reverse(int x) {
        int rev=0;
        while(x!=0){
            int remainder=x%10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && remainder > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && remainder < -8)) {
                return 0;
            }
            rev=(rev*10)+remainder;
            x/=10;
        }
        return rev;
    }
}