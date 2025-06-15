import java.util.Stack;

public class lc1047 {
    public static void main(String[] args) {
        Solution1047 s=new Solution1047();
        String st="abbaca";
        System.out.println(s.removeDuplicates(st));
    }
}
class Solution1047 {
    public String removeDuplicates(String s) {
        StringBuilder ans=new StringBuilder();
        for(char c: s.toCharArray()){
            int n=ans.length();
            if(ans.isEmpty()){
                ans.append(c);
            }
            else if(ans.charAt(n-1)==c){
                ans.deleteCharAt(n-1);
            }
            else{
                ans.append(c);
            }
        }
        return ans.toString();
    }
}
