public class lc8 {
    public static void main(String[] args) {
        Solution8 s=new Solution8();
        System.out.println(s.myAtoi("1337c0d3"));
    }
}
class Solution8 {
    public int myAtoi(String s) {
        int ans=0, i=0, sign=1, l=s.length();
        while(i<l && s.charAt(i)==' ')
            i++;

        if(i<l && (s.charAt(i)=='-' || s.charAt(i)=='+')){
            if(s.charAt(i)=='-')
                sign=-1;
            i++;
        }

        while(i<l && s.charAt(i)>='0' && s.charAt(i)<='9'){

            if(ans>Integer.MAX_VALUE/10 || (ans==Integer.MAX_VALUE/10 && (s.charAt(i)-'0')>7))
                return sign==1? Integer.MAX_VALUE: Integer.MIN_VALUE;

            ans=ans*10+(s.charAt(i)-'0');
            i++;
        }

        return ans*sign;


    }
}
