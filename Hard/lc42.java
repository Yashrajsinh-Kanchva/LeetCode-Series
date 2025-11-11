public class lc42 {
    public static void main(String[] args) {
        Solution42 s=new Solution42();
        System.out.println(s.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
class Solution42 {
    public int trap(int[] height) {
        int l=height.length;
        int[] left_max=new int[l];
        int[] right_max=new int[l];
        left_max[0]=height[0];
        right_max[l-1]=height[l-1];
        for(int i=1; i<l; i++)
            left_max[i] = Math.max(left_max[i - 1], height[i]);
        for(int i=l-2; i>=0; i--)
            right_max[i] = Math.max(right_max[i+1], height[i]);
        int ans=0;
        for(int i=0; i<l; i++)
            ans+=Math.min(left_max[i],right_max[i])-height[i];
        return ans;
    }
}