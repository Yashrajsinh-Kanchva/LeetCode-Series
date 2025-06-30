public class lc1281 {
    public static void main(String[] args) {
        Solution1281 s=new Solution1281();
        System.out.println(s.subtractProductAndSum(234));
    }
}
class Solution1281 {
    public int subtractProductAndSum(int n) {
        int product=1, sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            product*=rem;
            n/=10;
        }
        return product-sum;
    }
}
