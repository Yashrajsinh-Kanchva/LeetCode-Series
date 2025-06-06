public class lc75 {
    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};
        Solution75 s=new Solution75();
        s.sortColors(nums);
        for(int num: nums){
            System.out.print(num+" ");
        }
    }
}
class Solution75 {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];

        int pos=0;
        for (int j : nums) {
            if (j == 0)
                result[pos++] = j;
        }
        for (int num : nums) {
            if (num == 1)
                result[pos++] = num;
        }
        for (int num : nums) {
            if (num == 2)
                result[pos++] = num;
        }

        for(int i=0; i<n; i++){
            nums[i]=result[i];
        }
    }
}
