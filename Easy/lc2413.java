public class lc2413 {
    public static void main(String[] args) {
        Solution2413 s=new Solution2413();
        System.out.println(s.smallestEvenMultiple(6));
    }
}
class Solution2413 {
    public int smallestEvenMultiple(int n) {
        for(int i=1; i<=n; i++){
            if(i%n==0 && i%2==0)
                return i;
        }
        return 2*n;
    }
}
