public class lc4 {
    public static void main(String[] args) {
        Solution4 s=new Solution4();
        System.out.println(s.findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
    }
}
class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1Length=nums1.length;
        int n2Length=nums2.length;

        int[] merge=new int[n1Length+n2Length];
        int m=merge.length;
        int n1Index=0, n2Index=0;
        for(int i=0; i<m; i++){
            if(n1Index!=n1Length && n2Index!=n2Length) {
                if (nums1[n1Index] < nums2[n2Index])
                    merge[i] = nums1[n1Index++];
                else
                    merge[i] = nums2[n2Index++];
            }
            else {
                if (n1Index != n1Length)
                    merge[i] = nums1[n1Index++];
                if (n2Index != n2Length)
                    merge[i] = nums2[n2Index++];
            }
        }

        if(m%2!=0)
            return merge[m/2];
        else
            return (double) (merge[m / 2] + merge[(m / 2) - 1]) /2;
    }
}
