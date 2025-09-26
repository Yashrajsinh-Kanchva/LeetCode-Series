public class lc1816 {
    public static void main(String[] args) {
        Solution1816 s=new Solution1816();
        System.out.println(s.truncateSentence("Hello how are you Contestant", 4));
    }
}
class Solution1816 {
    public String truncateSentence(String s, int k) {
        String[] words=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<k-1; i++)
            sb.append(words[i]).append(" ");
        sb.append(words[k-1]);
        return sb.toString();
    }
}
