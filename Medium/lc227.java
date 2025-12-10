import java.util.Stack;

public class lc227 {
    public static void main(String[] args) {
        Solution227 s=new Solution227();
        System.out.println(s.calculate(" 3+5 / 2 "));
    }
}
class Solution227 {
    public int calculate(String s) {
        s=s.trim();
        int ans=0;
        int num=0;
        char prev='+';
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }

            if(!Character.isDigit(ch) && ch!=' ' || i==(s.length()-1)){
                if(prev=='*'){
                    st.push(st.pop()*num);
                }
                else if(prev=='/'){
                    st.push(st.pop()/num);
                }
                else if(prev=='+'){
                    st.push(num);
                }
                else if(prev=='-'){
                    st.push(-num);
                }
                prev=ch;
                num=0;
            }
        }
        while(!st.isEmpty())
            ans+=st.pop();

        return ans;
    }
}