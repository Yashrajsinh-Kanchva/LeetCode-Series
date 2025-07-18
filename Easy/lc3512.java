public class lc3512 {
    public static void main(String[] args) {
        Solution3512 s=new Solution3512();
        System.out.println(s.minOperations(new int[]{3,9,7}, 5));
    }
}
class Solution3512 {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int i: nums){
            sum+=i;
        }
        return sum%k;
    }
}
