public class lc287 {
    public static void main(String[] args) {
        Solution287 s=new Solution287();
        System.out.println(s.findDuplicate(new int[]{1,3,4,2,2}));
    }
}
class Solution287 {
    public int findDuplicate(int[] nums) {
        int[] count=new int[nums.length+1];
        for(int i:nums){
            count[i]++;
            if(count[i]==2)
                return i;
        }
        return -1;
    }
}
