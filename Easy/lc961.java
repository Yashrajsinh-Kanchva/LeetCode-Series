import java.util.HashSet;
import java.util.Set;

public class lc961 {
    public static void main(String[] args) {
        Solution961 s=new Solution961();
        System.out.println(s.repeatedNTimes(new int[]{2,1,2,5,3,2}));
    }
}
class Solution961{
    public int repeatedNTimes(int[] nums) {
//        Arrays.sort(nums);
//        for(int i=0; i<nums.length-1; i++){
//            if(nums[i]==nums[i+1])
//                return nums[i];
//        }
//        return -1;

        Set<Integer> s=new HashSet<>();
        for(int i:nums){
            if(!s.add(i))
                return i;
        }
        return -1;
    }
}