public class lc744 {
    public static void main(String[] args) {
        Solution744 s=new Solution744();
        System.out.println(s.nextGreatestLetter(new char[]{'c','f','j'},'a'));
    }
}
class Solution744 {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char ch:letters){
            if(target<=ch){
                return ch;
            }
        }
        return letters[0];
    }
}