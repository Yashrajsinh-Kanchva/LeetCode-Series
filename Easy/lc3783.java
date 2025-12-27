public class lc3783 {
    public static void main(String[] args) {
        Solution3783 s=new Solution3783();
        System.out.println(s.mirrorDistance(25));
    }
}
class Solution3783 {
    public int mirrorDistance(int n) {
        return Math.abs(n-reverse(n));
    }
    int reverse(int n){
        int rev=0;
        while(n>0){
            rev=(rev*10)+(n%10);
            n/=10;
        }
        return rev;
    }
}