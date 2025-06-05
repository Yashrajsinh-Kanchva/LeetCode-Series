import java.util.HashSet;

public class lc217 {
    public static void main(String[] args) {
        Solution217 s=new Solution217();
        int[] nums={1,2,3,1};
        System.out.println(s.containsDuplicate(nums));
    }
}
class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> num=new HashSet<>();
        for(Integer n: nums){
            if(!num.add(n))
                return true;
        }
        return false;
    }
}
