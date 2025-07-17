public class lc507 {
    public static void main(String[] args) {
        Solution507 s=new Solution507();
        System.out.println(s.checkPerfectNumber(28));
    }
}
class Solution507 {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i=1; i<num; i++){
            if(num%i==0)
                sum+=i;
        }
        return sum==num;
    }
}
