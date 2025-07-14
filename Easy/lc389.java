public class lc389 {
    public static void main(String[] args) {
        Solution389 s=new Solution389();
        System.out.println(s.findTheDifference("abcd", "abcde"));
    }
}
class Solution389 {
    public char findTheDifference(String s, String t) {
        int[] count=new int[26];
        for(char ch: t.toCharArray())
            count[ch-'a']++;
        for(char ch: s.toCharArray())
            count[ch-'a']--;
        for(int i=0; i<26; i++){
            if(count[i]!=0)
                return (char)(i+'a');
        }
        return ' ';
    }
}
