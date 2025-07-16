import java.util.Stack;

public class lc2696 {
    public static void main(String[] args) {
        Solution2696 s=new Solution2696();
        System.out.println(s.minLength("BJKDKABJ"));
    }
}
class Solution2696 {
    public int minLength(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(st.isEmpty())
                st.push(ch);
            else{
                if((ch=='B' && st.peek()=='A' ) || (ch=='D' && st.peek()=='C'))
                    st.pop();
                else
                    st.push(ch);
            }
        }
        return st.size();
    }
}
