public class lc367 {
    public static void main(String[] args) {
        Solution367 s=new Solution367();
        System.out.println(s.isPerfectSquare(15));
    }
}
class Solution367 {
    public boolean isPerfectSquare(int num) {
        long st=1,end=num;
        while(st<=end){
            long mid=st+(end-st)/2;
            long ans=mid*mid;

            if(ans==num)
                return true;
            if(ans>num)
                end=mid-1;
            else
                st=mid+1;

        }
        return false;
    }
}