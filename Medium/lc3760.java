import java.util.HashSet;

public class lc3760 {
    public static void main(String[] args) {
        Solution3760 s=new Solution3760();
        System.out.println(s.maxDistinct("abab"));
    }
}
class Solution3760 {
    public int maxDistinct(String s) {
        HashSet<Character> hs=new HashSet<>();
        for(char ch:s.toCharArray()) hs.add(ch);
        return hs.size();
    }
}