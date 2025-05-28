public class lc2351 {
    public static void main(String[] args) {
        Solution2351 s=new Solution2351();
        System.out.println(s.repeatedCharacter("abcbc"));
    }
}
class Solution2351 {
    public char repeatedCharacter(String s) {
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
            if(freq[c-'a']==2)
                return c;
        }

        return s.charAt(0);
    }
}