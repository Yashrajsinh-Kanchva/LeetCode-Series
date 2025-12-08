public class lc1925 {
    public static void main(String[] args) {
        Solution1925 s=new Solution1925();
        System.out.println(s.countTriples(10));
    }
}
class Solution1925 {
    public int countTriples(int n) {
        int count=0;
        for(int i=1; i<=n; i++){
            for(int j=i+1; j<=n; j++){
                int sum= i*i + j*j;
                int k=(int)Math.sqrt(sum);
                if(k*k==sum && k<=n)
                    count+=2;
            }
        }
        return count;
    }
}
