import java.util.ArrayList;
import java.util.List;

public class lc3314 {
    public static void main(String[] args) {
        Solution3314 s=new Solution3314();
        List<Integer> l=new ArrayList<>();
        l.add(2); l.add(3); l.add(5); l.add(7);
        int[] ans=s.minBitwiseArray(l);
        for(int i: ans){
            System.out.print(i+" ");
        }
    }
}
class Solution3314 {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] res = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            int n = nums.get(i);
            if ((n & 1) == 1)
                res[i] = n & ~(((n + 1) & ~n) >> 1);
            else
                res[i] = -1;
        }
        return res;
    }
}