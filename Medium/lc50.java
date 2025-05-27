public class lc50 {
    public static void main(String[] args) {
        Solution50 s=new Solution50();
        System.out.println(s.myPow(2,10));
        System.out.println(s.myPow(2.1,3));
        System.out.println(s.myPow(2,-2));
        System.out.println(s.myPow(2,0));
    }
}
class Solution50{
    public double myPow(double x, long n) {
        if(n==0) return 1;
        if(n>0){
            double half = myPow(x, n / 2);
            if (n % 2 == 0) {
                return half * half;
            } else {
                return half * half * x;
            }
        }
       else{
            return myPow((1/x),-(n));
        }

    }
}