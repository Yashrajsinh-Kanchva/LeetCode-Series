import java.math.BigInteger;

public class lc43 {
    public static void main(String[] args) {
        Solution43 s=new Solution43();
        System.out.println(s.multiply("123","456"));
    }
}
//this solution is valid,but it takes more time as compared to required time.
class Solution43 {
    public String multiply(String num1, String num2) {
        BigInteger n1=new BigInteger(num1);
        BigInteger n2=new BigInteger(num2);
        return n1.multiply(n2)+"";
    }
}