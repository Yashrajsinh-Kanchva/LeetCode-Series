public class lc2652 {
    public static void main(String[] args) {
        Solution2652 s=new Solution2652();
        System.out.println(s.sumOfMultiples(7));
    }
}
class Solution2652 {
    public int sumOfMultiples(int n) {
        int sum=0;
        for(int i=1; i<=n; i++){
            if(i%3==0 || i%5==0 || i%7==0) sum+=i;
        }
        return sum;
    }
}
