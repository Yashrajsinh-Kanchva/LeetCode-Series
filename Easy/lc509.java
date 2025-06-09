public class lc509 {
    public static void main(String[] args) {
        Solution509 s=new Solution509();
        System.out.println(s.fib(4));
    }
}
class Solution509 {
    public int fib(int n) {
        if(n==0 || n==1) return n;
        int a=0, b=1;
        for(int i=1; i<n; i++){
            int temp=b;
            b=a+b;
            a=temp;
        }
        return b;
    }
}
