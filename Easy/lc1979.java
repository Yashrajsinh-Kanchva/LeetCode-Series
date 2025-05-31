public class lc1979 {
    public static void main(String[] args) {
        Solution1979 s=new Solution1979();
        int[] nums={6,7,9};
        System.out.println(s.findGCD(nums));
    }
}
class Solution1979 {
    public int findGCD(int[] nums) {
        int max=0,min=nums[0];
        for(int i=0; i<nums.length; i++){
            if(min>=nums[i])
                min=nums[i];
            if(max<=nums[i])
                max=nums[i];
        }
        int common=1;
        if(min==0) return 0;
        for(int i=1; i<=max; i++){
            if(min%i==0 && max%i==0)
                common=i;
        }
        return common;
    }
}
