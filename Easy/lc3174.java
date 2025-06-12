public class lc3174 {
    public static void main(String[] args) {
        Solution3174 s=new Solution3174();
        System.out.println("cb34: "+ s.clearDigits("cb34"));
        System.out.println("abc: "+ s.clearDigits("abc"));
        System.out.println("aa2: "+ s.clearDigits("aa2"));
        System.out.println("a2aa: "+ s.clearDigits("a2aa"));
    }
}
class Solution3174 {
    public String clearDigits(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            boolean b=Character.isDigit(c);
            if(b)
                ans.deleteCharAt(ans.length()-1);
            else
                ans.append(c);
        }
        return ans.toString();
    }
}