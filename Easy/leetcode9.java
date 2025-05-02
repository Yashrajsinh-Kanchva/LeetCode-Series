public class leetcode9 {
    public static void main(String[] args) {
        int x=10;
        leetcode9 obj=new leetcode9();
        boolean ans=obj.isPalindrome(x);
        System.out.println(ans);
    }
    public boolean isPalindrome(int x) {
        int rev=0, temp=x;
        while(x>0){
            int rem=x%10;
            rev=(rev*10)+rem;
            x/=10;
        }
        if(temp==rev){
            return true;
        }
        else{
            return false;
        }
    }
}
