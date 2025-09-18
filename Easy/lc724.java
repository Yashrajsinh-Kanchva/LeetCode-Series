public class lc724 {
    public static void main(String[] args) {
        Solution724 s=new Solution724();
        System.out.println(s.pivotIndex(new int[]{2,5}));
    }
}
class Solution724 {
    public int pivotIndex(int[] nums) {
        int right=0, left=0;
        for(int i:nums)
            right+=i;
        for(int i=0; i<nums.length; i++){
            left+=nums[i];
            if(right==left) return i;
            right-=nums[i];
        }
        return -1;
    }
}
