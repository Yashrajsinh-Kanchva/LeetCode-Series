public class lc344 {
    public static void main(String[] args) {
        Solution344 s=new Solution344();
        char s1[]={'h','e','l','l','o'};
        s.reverseString(s1);
    }
}
class Solution344 {
    public void reverseString(char[] s) {
        int i=0, j=s.length-1;
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++; j--;
        }
    }
}
