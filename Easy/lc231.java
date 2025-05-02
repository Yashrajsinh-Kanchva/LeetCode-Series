public class lc231 {
    public static void main(String[] args) {
        Solution231 t=new Solution231();
        System.out.println(t.isPowerOfTwo(5));
    }
}
class Solution231 {
    public boolean isPowerOfTwo(int n) {
        if(n==1)
            return true;
        if(n%4!=0 || n<=0){
            return false;
        }
        else {
            while (n > 1) {
                if (n % 4 != 0) {
                    return false;
                } else {
                    n /= 4;
                }
            }
            return true;
        }
    }
}
