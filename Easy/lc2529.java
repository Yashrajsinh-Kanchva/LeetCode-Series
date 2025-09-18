public class lc2529 {
    public static void main(String[] args) {
        Solution2529 s=new Solution2529();
        System.out.println(s.maximumCount(new int[]{-3,-2,-1,0,0,1,2}));
    }
}
class Solution2529 {
    public int maximumCount(int[] nums) {
        int positive=0,negative=0;
        for(int i:nums){
            if(i>0) positive++;
            else if (i<0) negative++;
        }
        return Math.max(positive,negative);
    }
}
