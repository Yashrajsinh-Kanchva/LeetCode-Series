import java.util.Stack;

public class lc71 {
    public static void main(String[] args) {
        Solution71 s=new Solution71();
        System.out.println(s.simplifyPath("/.../a/../b/c/../d/./"));
    }
}
class Solution71 {
    public String simplifyPath(String path) {
        if(path.length()==1) return "/";
        String[] s=path.split("/");
        Stack<String> st=new Stack<>();
        for(String s1:s){
            if(s1.equals("..")) {
                if (!st.isEmpty())
                    st.pop();
            }
            else if(!s1.isEmpty() && !s1.equals(".")) {
                st.push(s1);
            }
        }
        StringBuilder sb=new StringBuilder();
        if (st.isEmpty()) return "/";
        for(String s1:st)
            sb.append("/").append(s1);
        return sb.toString();
    }
}
