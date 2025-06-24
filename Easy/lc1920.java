public class lc1920 {
    public static void main(String[] args) {
        Solution1920 s=new Solution1920();
        int[] n=s.buildArray(new int[]{0,2,1,5,3,4});
        for(int x: n){
            System.out.print(x+" ");
        }
    }
}
class Solution1920 {
    public int[] buildArray(int[] nums) {
        int[] n=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            n[i]=nums[nums[i]];
        }
        return n;
    }
}