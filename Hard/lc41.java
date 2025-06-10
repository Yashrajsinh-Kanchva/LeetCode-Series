import java.util.HashSet;
//import java.util.Hashtable;
//import java.util.Map;
import java.util.Set;

public class lc41 {
    public static void main(String[] args) {
        Solution41 s=new Solution41();
        int[] nums={7,8,9,11,12};
        System.out.println(s.firstMissingPositive(nums));
    }
}
class Solution41 {
    public int firstMissingPositive(int[] nums) {
//        Map<Integer, Boolean> hm=new Hashtable<>();
//        for(int i=1; i<=nums.length; i++){
//            hm.put(i, false);
//        }
//
//        for(int i=0; i<nums.length; i++){
//            hm.remove(nums[i]);
//        }
//
//        int ans=nums.length+1;
//        for(Integer n:hm.keySet()){
//            if(n<ans)
//                ans=n;
//        }
//        return ans;

        Set<Integer> s=new HashSet<>();
        for(int i:nums){
            if(i>0)
                s.add(i);
        }
        int missingNo=1;
        while(s.contains(missingNo)){
            missingNo++;
        }
        return missingNo;
    }
}
