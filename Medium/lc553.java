public class lc553 {
    public static void main(String[] args) {
        Solution553 s=new Solution553();
        int[] nums={1000,100,10,2};
        System.out.println(s.optimalDivision(nums));
    }
}
class Solution553 {
    public String optimalDivision(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0]+"";
        if(n==2) return nums[0]+"/"+nums[1];

        String ans=nums[0]+"/(";
        for(int i=1; i<n-1; i++){
            ans=ans.concat(nums[i]+"/");
        }
        ans=ans.concat(nums[n-1]+")");
        return ans;
    }
}
