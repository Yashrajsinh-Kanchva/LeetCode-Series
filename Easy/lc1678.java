public class lc1678 {
    public static void main(String[] args) {
        Solution1678 s=new Solution1678();
        System.out.println(s.interpret("G()(al)"));
    }
}
class Solution1678 {
    public String interpret(String command) {
        StringBuilder ans=new StringBuilder();
        for(int i=0; i<command.length(); i++){
            char ch=command.charAt(i);
            if(ch=='(' && command.charAt(i+1)==')'){
                ans.append("o");
                i++;
            }
            else if(ch=='('){
                ans.append("al");
                i+=3;
            }
            else{
                ans.append("G");
            }
        }
        return ans.toString();
    }
}
