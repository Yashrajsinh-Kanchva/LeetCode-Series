import java.util.*;
public class lc1461 {
    public static void main(String[] args) {
        Solution1461 s=new Solution1461();
        System.out.println(s.hasAllCodes("00110110",2));
    }
}
class Solution1461 {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> st = new HashSet<>();

        for (int i = 0; i + k <= s.length(); i++) {
            st.add(s.substring(i, i + k));
        }

        return st.size() == (int)Math.pow(2, k);
    }
}