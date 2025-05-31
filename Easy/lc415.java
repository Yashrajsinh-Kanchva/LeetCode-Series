public class lc415 {
    public static void main(String[] args) {
        Solution415 s=new Solution415();
        System.out.println(s.addStrings("1234","1116"));
    }
}
class Solution415 {
    public String addStrings(String num1, String num2) {
        int a=num1.length()-1;
        int b=num2.length()-1;
        int carry=0;
        StringBuilder sb=new StringBuilder();
        while(a>=0 || b>=0 || carry>0){
            int sum=carry;
            if(a>=0)
                sum=sum+num1.charAt(a--)-'0';
            if(b>=0)
                sum=sum+num2.charAt(b--)-'0';
            sb.append(sum%10);
            carry=sum/10;
        }
        if(carry!=0)
            sb.append(carry);
        String result=sb.reverse().toString();
        while(result.length()>1 && result.charAt(0)=='0')
            result=result.substring(1);
        return result;
    }
}