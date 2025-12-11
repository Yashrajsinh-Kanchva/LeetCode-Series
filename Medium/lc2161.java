public class lc2161 {
    public static void main(String[] args) {
        Solution2161 s=new Solution2161();
        int[] ans=s.pivotArray(new int[]{9,12,5,10,14,3,10},10);
        for(int n:ans)
            System.out.print(n+" ");
    }
}
class Solution2161 {
    public int[] pivotArray(int[] nums, int pivot) {
        int l=nums.length;
        int[] ans=new int[l];
        int i=0, count=0;
        for(int n:nums){
            if(n<pivot){
                ans[i++]=n;
            } else if (n==pivot) {
                count++;
            }
        }
        for(int j=0; j<count; j++)
            ans[i++]=pivot;
        for(int n:nums){
            if(n>pivot){
                ans[i++]=n;
            }
        }
        return ans;
    }
}
