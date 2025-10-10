public class lc3147 {
    public static void main(String[] args) {
        Solution3147 s=new Solution3147();
        System.out.println(s.maximumEnergy(new int[]{5,-10,4,3,5,-9,9,-7},2));
    }
}
class Solution3147 {
    public int maximumEnergy(int[] energy, int k) {
        //Time Limit Exceeded
//        int ans=Integer.MIN_VALUE;
//        int l=energy.length;
//        for(int i=l-1; i>=0; i--) {
//            int max=0;
//            int start=i;
//            int end=start+k;
//            if(end<energy.length) {
//                max+=energy[start];
//                while (end < energy.length) {
//                    max +=energy[end];
//                    start = end;
//                    end = start + k;
//                }
//            }
//            else{
//                max+=energy[start];
//            }
//            if(ans<max)
//                ans=max;
//        }
//        return ans;
        int l=energy.length;
        int ans=Integer.MIN_VALUE;
        int[] result=new int[l];

        for(int i=l-1; i>=0; i--){
            result[i]=energy[i]+(i+k<l? result[i+k]: 0);
            ans=Math.max(ans, result[i]);
        }

        return ans;
    }
}
