public class lc1780 {
    public static void main(String[] args) {
        Solution1780 s=new Solution1780();
        System.out.println(s.checkPowersOfThree(91));
    }
}
class Solution1780 {
    public boolean checkPowersOfThree(int n) {
        while(n>0){
            if(n%3==2) return false;
            n/=3;
        }
        return true;
    }
}