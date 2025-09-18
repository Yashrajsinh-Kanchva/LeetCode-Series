public class lc1991 {
    public static void main(String[] args) {
        Solution1991 s=new Solution1991();
        System.out.println(s.findMiddleIndex(new int[]{2,5}));
    }
}
class Solution1991 {
    public int findMiddleIndex(int[] nums) {
        // 1st Method
//        int sum1, sum2;
//        int length=nums.length;
//        for(int i=0; i<length; i++){
//            sum1=0; sum2=0;
//            for(int j=i-1; j>=0; j--)
//                sum1+=nums[j];
//            for(int j=i+1; j<length; j++)
//                sum2+=nums[j];
//            if(sum1==sum2) return i;
//        }

        //2nd Method
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