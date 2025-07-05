public class lc2520 {
    public static void main(String[] args) {
        Solution2520 s=new Solution2520();
        System.out.println(s.countDigits(121));
    }
}
class Solution2520 {
    public int countDigits(int num) {
        int count=0;
        int temp=num;
        while(temp>0){
            int rem=temp%10;
            if(num%rem==0)
                count++;
            temp/=10;
        }
        return count;
    }
}
