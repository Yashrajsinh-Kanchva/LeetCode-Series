public class lc2427 {
    public static void main(String[] args) {
        Solution2427 s=new Solution2427();
        System.out.println(s.commonFactors(12,6));
    }
}
class Solution2427 {
    public int commonFactors(int a, int b) {
        int count=0;
        int length=Math.min(a,b);
        for(int i=1; i<=length; i++){
            if(a%i==0 && b%i==0)
                count++;
        }
        return count;
    }
}
