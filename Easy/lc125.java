public class lc125 {
    public static void main(String[] args) {
        Solution125 s=new Solution125();
        System.out.println(s.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
class Solution125 {
    public boolean isPalindrome(String s) {
        if(s.isEmpty())
            return true;
        int start=0, end=s.length()-1;
        while(start<end){
            char ch1=s.charAt(start);
            char ch2=s.charAt(end);
            if(!Character.isLetterOrDigit(ch1)){
                start++;
            } else if (!Character.isLetterOrDigit(ch2)) {
                end--;
            }else{
                if(!(Character.toLowerCase(ch1)==Character.toLowerCase(ch2)))
                    return false;
                start++;
                end--;
            }
        }
        return true;
    }
}