public class lc1390 {
    public static void main(String[] args) {
        Solution1390 s=new Solution1390();
        System.out.println(s.sumFourDivisors(new int[]{21,4,7}));
    }
}
class Solution1390 {
    public int sumFourDivisors(int[] nums) {
        int ans=0;
        for(int n:nums){
            int sum=0;
            int count=0;
            for(int j=1; j*j<=n; j++){
                if(n%j==0){
                    sum+=j;
                    count++;
                    if(j*j!=n){
                        count++;
                        sum+=n/j;
                    }
                }
                if(count>4) break;
            }
            if(count==4)
                ans+=sum;
        }
        return ans;
    }
}