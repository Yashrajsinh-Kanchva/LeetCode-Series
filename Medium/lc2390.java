public class lc2390 {
    public static void main(String[] args) {
        Solution2390 s=new Solution2390();
        System.out.println(s.removeStars("leet**cod*e"));
    }
}
class Solution2390 {
    public String removeStars(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='*' && !sb.isEmpty())
                sb.deleteCharAt(sb.length()-1);
            else if(c!='*')
                sb.append(c);
        }
        return sb.toString();
    }
}