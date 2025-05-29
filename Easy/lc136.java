import java.util.ArrayList;
import java.util.Collections;

public class lc136{
    public static void main(String[] args) {
        Solution136 s=new Solution136();
        int[] nums={1,2,3,2,1};
        System.out.println(s.singleNumber(nums));
    }
}
class Solution136 {
    public int singleNumber(int[] nums) {
//        ArrayList<Integer> al=new ArrayList<>();
//        int num=0;
//        for(int i=0; i<nums.length; i++)
//            al.add(nums[i]);
//        for(int i=0; i<al.size(); i++){
//            if(Collections.frequency(al,al.get(i))==1){
//                num= al.get(i); break;}
//        }
//        return num;
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}