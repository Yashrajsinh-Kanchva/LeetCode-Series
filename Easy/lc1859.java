public class lc1859 {
    public static void main(String[] args) {
        Solution1859 s=new Solution1859();
        System.out.println(s.sortSentence("is2 sentence4 This1 a3"));
    }
}
class Solution1859 {
    public String sortSentence(String s) {
        String[] st=s.split(" ");
        String[] ans=new String[st.length+1];
        for (String string : st) {
            StringBuilder word = new StringBuilder(string);
            int j = word.charAt(word.length() - 1)-'0';
            word.deleteCharAt(word.length() - 1);
            ans[j] = word.toString();
        }
        StringBuilder sb=new StringBuilder();
        for(int i=1; i<ans.length-1; i++){
            String w=ans[i];
            sb.append(w).append(" ");
        }
        sb.append(ans[ans.length-1]);
        return sb.toString();
    }
}
