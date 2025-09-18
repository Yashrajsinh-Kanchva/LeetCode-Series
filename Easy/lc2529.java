public class lc2529 {
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
