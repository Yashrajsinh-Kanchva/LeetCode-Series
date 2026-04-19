public class lc1855 {
    public static void main(String[] args) {
        Solution1855 s=new Solution1855();
        System.out.println(s.maxDistance(new int[]{55,30,5,4,2}, new int[]{100,20,10,10,5}));
    }
}
class Solution1855 {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i=1, j=1;

        for(i=0; i<nums1.length && j<nums2.length ; j++){
            if(nums1[i]>nums2[j]) i++;
        }

        return j-i-1;
    }
}