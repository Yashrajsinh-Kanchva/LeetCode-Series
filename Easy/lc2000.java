public class lc2000 {
    public static void main(String[] args) {
        Solution2000 s=new Solution2000();
        System.out.println(s.reversePrefix("abcd",'c'));
    }
}
class Solution2000 {
    public String reversePrefix(String word, char ch) {
            int index=word.indexOf(ch);
            if(index==-1) return word;
            StringBuilder ans=new StringBuilder(word.substring(0, index+1));
            ans.reverse();
            ans.append(word.substring(index+1));
            return ans.toString();
    }
}