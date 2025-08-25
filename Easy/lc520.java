public class lc520 {
    public static void main(String[] args) {
        Solution520 s=new Solution520();
        System.out.println(s.detectCapitalUse("FlaG"));
    }
}
class Solution520 {
    public boolean detectCapitalUse(String word) {
        int count=0,firstCount=0;
        char ch=word.charAt(0);
        if(ch>=65 && ch<=90) {
            firstCount++;
            count++;
        }
        for(int i=1; i<word.length(); i++){
            ch=word.charAt(i);
            if(ch>=65 && ch<=90)
                count++;
        }
        return (firstCount == 1 && count==1) || count == 0 || count == word.length();
    }
}
