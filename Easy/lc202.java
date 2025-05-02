public class lc202 {
    public static void main(String[] args) {
        Solution202 s=new Solution202();
        System.out.println(s.isHappy(1111111));
    }
}
class Solution202 {
    public boolean isHappy(int n) {
        int sum;
        do{
            sum=0;
            while(n>0){
                int r=n%10;
                sum+=(int)Math.pow(r,2);
                n/=10;
            }
            n=sum;
        }while(n>=7);
        if(n==1)
            return true;
        else
            return false;
    }
}
