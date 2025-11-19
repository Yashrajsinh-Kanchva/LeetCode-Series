public class lc2154 {
    public static void main(String[] args) {
        Solution2154 s=new Solution2154();
        System.out.println(s.findFinalValue(new int[]{5,3,6,1,12},3));
    }
}
class Solution2154 {
    public int findFinalValue(int[] nums, int original) {
        if(check(nums, original)) return original;
        while(true){
            original*=2;
            if(check(nums, original)) return original;
        }
    }
    boolean check(int[] nums, int target){
        for(int i:nums){
            if(i==target)
                return false;
        }
        return true;
    }
}