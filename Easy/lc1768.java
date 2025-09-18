public class lc1768 {
    public static void main(String[] args) {
        Solution1768 s=new Solution1768();
        System.out.println(s.mergeAlternately("ab","pqrs"));
    }
}
class Solution1768 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s=new StringBuilder();
        int i=0;
        int l1=word1.length(), l2=word2.length();
        while(i!=l1 && i!=l2){
            s.append(word1.charAt(i)).append(word2.charAt(i));
            i++;
        }
        if(i!=l2){
            while(i!=l2)
                s.append(word2.charAt(i++));
        }
        else if(i != l1){
            while(i!=l1)
                s.append(word1.charAt(i++));
        }
        return s.toString();
    }
}
