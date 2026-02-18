public class lc693 {
    public static void main(String[] args) {
        Solution693 s=new Solution693();
        System.out.println(s.hasAlternatingBits(5));
    }
}
class Solution693 {
    public boolean hasAlternatingBits(int n) {
        int x = n ^ (n >> 1);
        return (x & (x + 1)) == 0;
    }
}