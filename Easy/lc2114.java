public class lc2114 {
    public static void main(String[] args) {
        Solution2114 s=new Solution2114();
        String[] st={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(s.mostWordsFound(st));
    }
}
class Solution2114 {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String s: sentences){
            String[] words=s.split(" ");
            max=Math.max(max, words.length);
        }
        return max;
    }
}
