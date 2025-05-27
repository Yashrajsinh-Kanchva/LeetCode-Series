import java.util.Stack;

public class lc20 {
    public static void main(String[] args) {
        Solution20 obj=new Solution20();
        System.out.println(obj.isValid("()(())"));
    }
}
class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> s1=new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                s1.push(s.charAt(i));
            }
            else if((s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']')){
                if(s1.isEmpty())
                    return false;
                char top=s1.pop();
                if((s.charAt(i)==')' && top!='(' )|| (s.charAt(i)=='}' && top!='{' ) || (s.charAt(i)==']' && top!='[' )){
                    return false;
                }
            }
        }
        return s1.isEmpty();
    }
}