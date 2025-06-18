public class lc3110 {
    public static void main(String[] args) {
        Solution3110 s=new Solution3110();
        System.out.println(s.scoreOfString("hello"));
    }
}
class Solution3110 {
    public int scoreOfString(String s) {
        int score=0;
        for(int i=0; i<s.length()-1;i++){
            score+=Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return score;
    }
}
