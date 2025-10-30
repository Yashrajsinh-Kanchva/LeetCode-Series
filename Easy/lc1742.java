public class lc1742 {
    public static void main(String[] args) {
        Solution1742 s=new Solution1742();
        System.out.println(s.countBalls(1,10));
    }
}
class Solution1742 {
    public int countBalls(int lowLimit, int highLimit) {
        int[] ans=new int[highLimit+1];
        int max=0;
        for(int i=lowLimit; i<=highLimit; i++){
            int sum=0;
            int temp=i;
            while(temp>0){
                sum+=(temp%10);
                temp/=10;
            }
            ans[sum]++;
            max = Math.max(max ,ans[sum] ) ;
        }
        return max;
    }
}
