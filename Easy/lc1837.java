public class lc1837 {
    public static void main(String[] args) {
        Solution1837 s=new Solution1837();
        System.out.println(s.sumBase(34,6));
    }
}
class Solution1837 {
    public int sumBase(int n, int k) {
        int sum=0;
        while(n>0){
            sum+=n%k;
            n/=k;
        }
        return sum;
    }
}