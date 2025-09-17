public class lc1935{
    public static void main(String[] args) {
        Solution1935 s=new Solution1935();
        System.out.println(s.canBeTypedWords("leet code", "lt"));
    }
}
class Solution1935 {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words=text.split(" ");
        int count=0;
        for(String word: words){
            boolean flag=true;
            for(int i=0; i<brokenLetters.length(); i++){
                char ch=brokenLetters.charAt(i);
                flag = word.indexOf(ch) == -1;
                if(!flag) break;
            }
            if(flag)
                count++;
        }
        return count;
    }
}