public class lc383 {
    public static void main(String[] args) {
        Solution383 s=new Solution383();
        System.out.println(s.canConstruct("aa","aab"));
    }
}
class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq=new int[26];

        for(char ch: magazine.toCharArray()){
            freq[ch-'a']++;
        }

        for(char ch:ransomNote.toCharArray()){
            if(freq[ch-'a']==0) return false;
            else freq[ch-'a']--;
        }
        return true;
    }
}
