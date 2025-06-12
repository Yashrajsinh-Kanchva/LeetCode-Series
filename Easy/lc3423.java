public class lc3423 {
    public static void main(String[] args) {
        Solution3423 s=new Solution3423();
        int[] nums={-5,-10,-5};
        System.out.println(s.maxAdjacentDistance(nums));
    }
}
class Solution3423 {
    public int maxAdjacentDistance(int[] nums) {

        int max=nums[1]-nums[0];
        int index=0;
        do{
            int index2= index+1;
            index2= index2==nums.length? 0 : index2;
            max=Math.max(max, Math.abs(nums[index2]-nums[index]));
            index++;
            index= index==nums.length? 0: index;
        }while(index!=0);

        return max;
    }
}
