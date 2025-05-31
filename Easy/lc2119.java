public class lc2119 {
    public static void main(String[] args) {
        Solution2119 s=new Solution2119();
        System.out.println(s.isSameAfterReversals(18));
    }
}

class Solution2119 {
    public boolean isSameAfterReversals(int num) {
        int reversed1=reverse(num);
        int reversed2=reverse(reversed1);
        if(reversed2==num)
            return true;
        return false;
    }
    public int reverse(int num){
        int temp=num;
        int rev=0;
        while(temp>0){
            int remainder=temp%10;
            rev=(rev*10)+remainder;
            temp/=10;
        }
        return rev;
    }
}