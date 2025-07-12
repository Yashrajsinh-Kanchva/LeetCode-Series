public class lc1512 {
    public static void main(String[] args) {
        Solution1512 s=new Solution1512();
        int[] nums={1,2,3,1,1,3};
        System.out.println(s.numIdenticalPairs(nums));
    }
}
class Solution1512 {
    public int numIdenticalPairs(int[] nums) {
        int count=0, length=nums.length;
        for(int i=0; i<length; i++){
            for(int j=i+1; j<length; j++){
                if(nums[i]==nums[j])
                    count++;
            }
        }
        return count;
    }
}
