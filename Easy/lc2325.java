import java.util.HashMap;

public class lc2325 {
    public static void main(String[] args) {
        Solution2325 s=new Solution2325();
        System.out.println(s.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }
}
class Solution2325 {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> hm=new HashMap<>();
        int i=97;
        for(char ch:key.toCharArray()){
            if(ch!=' ' && !hm.containsKey(ch)){
                hm.put(ch, (char)i++);
            }
        }
        StringBuilder ans=new StringBuilder();
        for(char c: message.toCharArray()){
            if(c!=' ')
                ans.append(hm.get(c));
            else
                ans.append(" ");
        }

        return ans.toString();
    }
}
