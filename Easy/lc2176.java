public class lc2176 {
    public static void main(String[] args) {
        Solution2176 s=new Solution2176();
        int[] n={3,1,2,2,2,1,3};
        System.out.println(s.countPairs(n, 2));
    }
}
class Solution2176 {
    public int countPairs(int[] nums, int k) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j] && (i*j)%2==0)
                    count++;
            }
        }
        return count;
    }
}
