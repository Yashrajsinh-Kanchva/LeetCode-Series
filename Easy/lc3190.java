public class lc3190 {
    public static void main(String[] args) {
        Solution3190 s=new Solution3190();
        System.out.println(s.minimumOperations(new int[]{1,2,3,4}));
    }
}
class Solution3190 {
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int n:nums){
            if((n-1)%3==0 || (n+1)%3==0)
                count++;
        }
        return count;
    }
}