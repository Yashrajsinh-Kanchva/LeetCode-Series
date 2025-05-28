public class lc172 {
    public static void main(String[] args) {
        Solution172 s=new Solution172();
        System.out.println(s.trailingZeroes(10000));
    }
}
class Solution172 {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>=5){
            n/=5;
            count+=n;
        }
        return count;
    }
}