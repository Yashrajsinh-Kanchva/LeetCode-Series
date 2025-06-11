import java.util.Stack;

public class lc844 {
    public static void main(String[] args) {
        Solution844 s = new Solution844();
        System.out.println(s.backspaceCompare("ab#c", "ad#c"));
    }
}
class Solution844 {
    public boolean backspaceCompare(String s, String t) {
        // one of the methods
//        Stack<Character> s1=new Stack<>();
//        Stack<Character> t1=new Stack<>();
//
//        for(int i=0; i<s.length(); i++){
//            char character=s.charAt(i);
//            if(character!='#')
//                s1.push(character);
//            else if(!s1.isEmpty())
//                s1.pop();
//        }
//
//        for(int i=0; i<t.length(); i++){
//            char character=t.charAt(i);
//            if(character!='#')
//                t1.push(character);
//            else if(!s1.isEmpty())
//                t1.pop();
//        }
//
//        if(s1.size()!=t1.size()){
//            return false;
//        }
//        else{
//            while(!s1.isEmpty()){
//                if(s1.pop()!=t1.pop()) return false;
//            }
//        }
//        return true;

        StringBuilder s1=new StringBuilder();
        StringBuilder t1=new StringBuilder();
        for(char c: s.toCharArray()){
            if(c!='#'){
                s1.append(c);
            }
            else{
                if(!s1.isEmpty())
                    s1.deleteCharAt(s1.length()-1);
            }
        }
        for(char c: t.toCharArray()){
            if(c!='#'){
                t1.append(c);
            }
            else{
                if(!t1.isEmpty())
                    t1.deleteCharAt(t1.length()-1);
            }
        }

        return s1.toString().contentEquals(t1);
    }
}
