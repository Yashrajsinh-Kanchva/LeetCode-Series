public class lc88 {
    public static void main(String[] args) {
        int nums1[]={1,2,3,0,0,0};
        int nums2[]={2,5,6};
        Solution88 s=new Solution88();
        s.merge(nums1,3,nums2,3);
        for(int i=0; i<nums1.length; i++){
            System.out.print(nums1[i]+" ");
        }
    }
}
class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int k=0;
//        for(int i=m; i<m+n; i++){
//            nums1[i]=nums2[k++];
//        }
//
//        for(int i=0; i<nums1.length-1; i++){
//            for(int j=0; j<nums1.length-i-1; j++){
//                if(nums1[j]>nums1[j+1]){
//                    int temp=nums1[j];
//                    nums1[j]=nums1[j+1];
//                    nums1[j+1]=temp;
//                }
//            }
//        }

        int mIndex=m-1;
        int nIndex=n-1;
        int tIndex=nums1.length-1;
        while(mIndex>=0 && nIndex>=0){
            if(nums1[mIndex]>=nums2[nIndex]) nums1[tIndex--]=nums1[mIndex--];
            else nums1[tIndex--]=nums2[nIndex--];
        }
        while(nIndex >= 0)
            nums1[tIndex--] = nums2[nIndex--];
    }
}