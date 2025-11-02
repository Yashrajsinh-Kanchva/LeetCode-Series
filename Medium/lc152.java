public class lc152 {
    public static void main(String[] args) {
        Solution152 s=new Solution152();
        System.out.println(s.maxProduct(new int[]{2,3,-2,4}));
    }
}
class Solution152 {
    public int maxProduct(int[] nums) {

        //METHOD-1
//        int ans=nums[0], maxEnd=nums[0], minEnd=nums[0];
//
//        for(int i=1; i<nums.length; i++){
//            int n=nums[i];
//            int temp=Math.max(n,maxEnd*n);
//            temp=Math.max(temp,minEnd*n);
//
//            minEnd=Math.min(n,minEnd*n);
//            minEnd=Math.min(minEnd, maxEnd*n);
//
//            maxEnd=temp;
//
//            ans=Math.max(ans,maxEnd);
//        }
//        return ans;

        //METHOD-2
        int l=nums.length;
        int l2r=nums[0];
        int r2l=nums[l-1];
        int ans=Math.max(l2r,r2l);

        for(int i=1; i<l; i++){
            if(l2r==0)
                l2r=1;
            if(r2l==0)
                r2l=1;

            l2r*=nums[i];
            int j=l-1-i;
            r2l*=nums[j];

            ans=Math.max(ans,l2r);
            ans=Math.max(ans,r2l);
        }
        return ans;
    }
}
