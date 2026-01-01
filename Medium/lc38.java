public class lc38 {
    public static void main(String[] args) {
        Solution38 s=new Solution38();
        System.out.println(s.countAndSay(4));
    }
}
class Solution38 {
    public String countAndSay(int n) {
        StringBuilder sb=new StringBuilder();
        sb.append("1");
        for(int i=2; i<=n; i++){
            int count=1;
            StringBuilder s=new StringBuilder();
            for(int j=0; j<sb.length()-1; j++){
                if(sb.charAt(j)==sb.charAt(j+1)) {
                    count++;
                }
                else{
                    s.append(count).append(sb.charAt(j));
                    count=1;
                }
            }
            s.append(count).append(sb.charAt(sb.length()-1));
            sb=s;
        }
        return sb.toString();
    }
}
