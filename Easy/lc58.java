public class lc58 {
    public static void main(String[] args) {
        Solution58 s=new Solution58();
        System.out.println(s.lengthOfLastWord("abc  "));
    }
}
class Solution58 {
    public int lengthOfLastWord(String s) {
        //Method-1
//        String s1=s.trim();
//        boolean b=false;
//        int i=s1.length()-1;
//        int count=0;
//        while(!b){
//            if(i==-1 || s1.charAt(i)==' ' ){
//                b=true;
//                continue;
//            }
//            count++;
//            i--;
//        }
//        return count;

        String[] words=s.split(" ");
        String lastWord =  words[words.length - 1];
        return lastWord.length();
    }
}