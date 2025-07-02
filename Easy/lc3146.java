public class lc3146 {
    public static void main(String[] args) {
        Solution3146 s=new Solution3146();
        System.out.println(s.findPermutationDifference("abc","bac"));
    }
}
class Solution3146 {
    public int findPermutationDifference(String s, String t) {
        int sum=0;
        for(int i=0; i<s.length(); i++){
            char ch1=s.charAt(i);
            for(int j=0; j<t.length(); j++){
                char ch2=t.charAt(j);
                if(ch1==ch2){
                    sum+=Math.abs(i-j);
                    break;
                }
            }
        }
        return sum;
    }
}
