public class lc918 {
    public static void main(String[] args) {
        Solution918 s=new Solution918();
        System.out.println(s.maxSubarraySumCircular(new int[]{1,-2,3,-2}));
    }
}
class Solution918 {
    public int maxSubarraySumCircular(int[] arr) {
        int l=arr.length;
        int[] maxSuffix=new int[l+1];
        maxSuffix[l-1]=arr[l-1];

        int sum=arr[l-1];
        for(int i=l-2; i>=0; i--){
            sum+=arr[i];
            maxSuffix[i]=Math.max(sum,maxSuffix[i+1]);
        }

        int cSum=arr[0], nSum=arr[0];
        int pre=0,curr=0;

        for(int i=0; i<l; i++){
            curr=Math.max(curr+arr[i],arr[i]);
            nSum=Math.max(nSum,curr);

            pre+=arr[i];
            cSum=Math.max(cSum,pre+maxSuffix[i+1]);
        }

        return Math.max(cSum,nSum);
    }
}