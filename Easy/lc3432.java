public class lc3432 {
    public static void main(String[] args) {
        Solution3432 s=new Solution3432();
        System.out.println(s.countPartitions(new int[]{2,4,6,8}));
    }
}
class Solution3432 {
    public int countPartitions(int[] nums) {
        int count=0;
        int l=nums.length;

        for(int j=1; j<l; j++){
            int sum=0;
            for(int k=0; k<j; k++){
                sum+=nums[k];
            }
            for(int k=j; k<l; k++){
                sum-=nums[k];
            }
            if (sum%2==0)
                count++;
        }
        return count;
    }
}
