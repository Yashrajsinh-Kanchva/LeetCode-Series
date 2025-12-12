public class lc3271 {
    public static void main(String[] args) {
        Solution3271 s=new Solution3271();
        System.out.println(s.stringHash("abcd",2));
    }
}
class Solution3271 {
    public String stringHash(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int l=s.length();
        int count=0,sum=0;
        for(int i=0; i<l;i++){
            sum+=(s.charAt(i)-'a');
            count++;
            if(count==k) {
                count=0;
                sb.append((char) ('a' + (sum % 26)));
                sum=0;
            }
        }

        return sb.toString();
    }
}