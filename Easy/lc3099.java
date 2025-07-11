public class lc3099 {
    public static void main(String[] args) {
        Solution3099 s=new Solution3099();
        System.out.println(s.sumOfTheDigitsOfHarshadNumber(18));
    }
}
class Solution3099 {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int temp=x;
        int sum=0;
        while(temp>0){
            int rem=temp%10;
            sum+=rem;
            temp/=10;
        }
        return x%sum==0 ? sum : -1;
    }
}