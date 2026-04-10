public class lc3740 {
    public static void main(String[] args) {
        Solution3740 s=new Solution3740();
        System.out.println(s.minimumDistance(new int[]{1,2,1,1,3}));
    }
}
class Solution3740 {
    public int minimumDistance(int[] nums) {
        int n = nums.length ;
        if (n <= 2) return -1 ;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++)
            for (int j = i+1; j < n; j++)
                if (nums[i] == nums[j])
                    for (int k = j+1; k < n; k++)
                        if (nums[j] == nums[k])
                            ans = Math.min(ans, 2*(k-i)) ;
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}