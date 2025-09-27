public class lc2485 {
    public static void main(String[] args) {
        Solution2485 s=new Solution2485();
        System.out.println(s.pivotInteger(8));
    }
}
class Solution2485 {
    public int pivotInteger(int n) {
        //m1
//        int sum=n*(n+1)/2;
//        int sum1=0;
//        while(n>0){
//            if(sum==sum1+n){
//                break;
//            }
//            else{
//                sum-=n;
//                sum1+=n;
//                n--;
//            }
//        }
//        if(n<0) return-1;
//        return n;

        //m2
        int sum=n*(n+1)/2;
        int sqr=(int)Math.sqrt(sum);
        return sqr*sqr==sum ? sqr : -1;
    }
}
