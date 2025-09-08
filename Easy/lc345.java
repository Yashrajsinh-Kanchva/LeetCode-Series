import java.util.Stack;

public class lc345 {
    public static void main(String[] args) {
        Solution345 s=new Solution345();
        System.out.println(s.reverseVowels("leetcode"));
    }
}
class Solution345 {
    public String reverseVowels(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch: s.toCharArray()) {
            switch (ch){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    st.push(ch);
            }
        }

        StringBuilder sb=new StringBuilder();
        sb.append(s);
        for(int i=0; i<sb.length(); i++){
            char ch=sb.charAt(i);
            switch (ch){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    char c=st.pop();
                    sb.replace(i,i+1,c+"");
            }
        }
        return sb.toString();
    }
}
