public class lc28 {
    public static void main(String[] args) {
        Solution28 s=new Solution28();
        System.out.println(s.strStr("sad","sadbutsad"));
    }
}
class Solution28 {
    public int strStr(String haystack, String needle) {
        for(int i=0; i<haystack.length(); i++){
            if(i+needle.length()>haystack.length()) return -1;
            if(haystack.substring(i, i+needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}