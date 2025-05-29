public class lc1967 {
    public static void main(String[] args) {
        Solution1967 s=new Solution1967();
        String[] patterns={"a","b","c"};
        System.out.println(s.numOfStrings(patterns,"aaaabbbb"));
    }
}
class Solution1967 {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String pattern : patterns){
            if(word.contains(pattern)){
                count++;
            }
        }
        return count;
    }
}