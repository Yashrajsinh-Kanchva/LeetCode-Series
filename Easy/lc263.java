import java.util.ArrayList;

public class lc263 {
    public static void main(String[] args) {
        Solution263 s=new Solution263();
        System.out.println(s.isUgly(14));
    }
}
class Solution263 {
    public boolean isUgly(int n) {
        if(n<=0)
            return false;
        while(n%2==0)
            n/=2;
        while(n%3==0)
            n/=3;
        while(n%5==0)
            n/=5;

        return n==1;
    }
}