public class lc1470 {
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        Solution1470 s=new Solution1470();
        int[] result=s.shuffle(nums, 3);
        for(int n: result){
            System.out.print(n+" ");
        }
    }
}
class Solution1470 {
    public int[] shuffle(int[] nums, int n) {
        int ans[] =new int[nums.length];
        int index=0;
        for(int i=0; i<nums.length; i+=2) {
            ans[i] = nums[index++];
        }
        for(int i=1; i<nums.length; i+=2){
            ans[i]=nums[index++];
        }
        return ans;
    }
}