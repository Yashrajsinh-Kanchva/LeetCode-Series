public class lc3550 {
    public static void main(String[] args) {
        Solution3550 s=new Solution3550();
        System.out.println(s.smallestIndex(new int[]{1,3,2}));
    }
}
class Solution3550 {
    public int smallestIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int n=nums[i];
            int sum=0;
            while(n>0){
                sum+=n%10;
                n/=10;
            }
            if(sum==i)
                return i;
        }
        return -1;
    }
}
