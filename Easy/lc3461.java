public class lc3461 {
    public static void main(String[] args) {
        Solution3461 s=new Solution3461();
        System.out.println(s.hasSameDigits("3902"));
    }
}
class Solution3461 {
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
            StringBuilder sb=new StringBuilder();
            for(int i=0; i<s.length()-1; i++){
                sb.append(((s.charAt(i)-'0')+(s.charAt(i+1)-'0'))%10);
            }
            s=sb.toString();
        }
        return s.charAt(0) == s.charAt(1);
    }
}
