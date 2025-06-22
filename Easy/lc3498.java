public class lc3498 {
    public static void main(String[] args) {
        Solution3498 s=new Solution3498();
        System.out.println(s.reverseDegree("abc"));
    }
}
class Solution3498 {
    public int reverseDegree(String s) {
        int[] reverseAlphabet=new int[26];
        int degree=26;
        for(int i=0; i<26; i++){
            reverseAlphabet[i]=degree--;
        }
        int sum=0;
        for(int i=0; i<s.length(); i++){
            sum+=(i+1)*reverseAlphabet[s.charAt(i)-'a'];
        }
        return sum;
    }
}
