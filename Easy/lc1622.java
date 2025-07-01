public class lc1622 {
    public static void main(String[] args) {
        Solution1622 s=new Solution1622();
        System.out.println(s.arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
    }
}
class Solution1622 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w1=new StringBuilder();
        StringBuilder w2=new StringBuilder();
        for (String s : word1)
            w1.append(s);
        for(String s: word2)
            w2.append(s);

        return w1.toString().equals(w2.toString());
    }
}