public class lc1880 {
    public static void main(String[] args) {
        Solution1880 s=new Solution1880();
        System.out.println(s.isSumEqual("acb","cba", "cdb"));
    }
}
class Solution1880 {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int targetAns=0;
        int ans1=0, ans2=0;

        for(char ch: firstWord.toCharArray())
            ans1= ans1*10 + checkChar(ch);

        for(char ch: secondWord.toCharArray())
            ans2= ans2*10 + checkChar(ch);

        for(char ch: targetWord.toCharArray())
            targetAns= targetAns*10 + checkChar(ch);

        return targetAns==(ans1+ans2);
    }
    int checkChar(char ch){
        return switch (ch) {
            case 'b' -> 1;
            case 'c' -> 2;
            case 'd' -> 3;
            case 'e' -> 4;
            case 'f' -> 5;
            case 'g' -> 6;
            case 'h' -> 7;
            case 'i' -> 8;
            case 'j' -> 9;
            default -> 0;
        };
    }
}
