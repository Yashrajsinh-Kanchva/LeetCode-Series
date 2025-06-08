import java.util.Objects;

public class lc151 {
    public static void main(String[] args) {
        Solution151 s=new Solution151();
        System.out.println(s.reverseWords("a good   example"));
    }
}
class Solution151 {
    public String reverseWords(String s) {
        String[] words=s.trim().split(" ");
        StringBuilder reverse=new StringBuilder();
        for(int i=words.length-1; i>0; i--){
            if(!words[i].isEmpty()) {
                reverse.append(words[i]).append(" ");
            }
        }
        reverse.append(words[0]);
        return reverse.toString();
    }
}