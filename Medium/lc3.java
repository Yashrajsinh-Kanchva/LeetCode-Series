import java.util.HashSet;
import java.util.Set;

public class lc3 {
    public static void main(String[] args) {
        Solution3 s=new Solution3();
        System.out.println(s.lengthOfLongestSubstring("pwwkew"));
    }
}
class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int count=0;
        int right=0, left=0;
        Set<Character> st=new HashSet<>();
        while(right<s.length()){
            char ch=s.charAt(right);
            if(!st.contains(ch)){
                st.add(ch);
                right++;
                count=Math.max(st.size(),count);
            }else {
                char ch1=s.charAt(left);
                st.remove(ch1);
                left++;
            }

        }
        return count;
    }
}
