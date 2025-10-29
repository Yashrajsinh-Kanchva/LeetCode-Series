public class lc3370 {
    public static void main(String[] args) {
        Solution3370 s=new Solution3370();
        System.out.println(s.smallestNumber(5));
    }
}
class Solution3370 {
    public int smallestNumber(int n) {
        //Method1
//        int count=0;
//        int ans=0;
//        while(n>0){
//            count++;
//            n/=2;
//        }
//        while(count>=0){
//            ans+=(int)Math.pow(2,--count);
//        }
//        return ans;

        //Method2
        int ans=n;
        while((ans&(ans+1))!=0){
            ans++;
        }
        return ans;
    }
}