import java.util.ArrayList;
import java.util.List;

public class lc3315 {
    public static void main(String[] args) {
        Solution3315 s=new Solution3315();

        List<Integer> l=new ArrayList<>();
        l.add(2); l.add(3); l.add(5); l.add(7);
        int[] ans=s.minBitwiseArray(l);

        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
class Solution3315 {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] answer = new int[nums.size()];

        for (int i = 0; i < answer.length; i++) {
            int k = nums.get(i), n = 1, ans = -1;

            while ((k & n) != 0) {
                ans = k - n;
                n <<= 1;
            }

            answer[i] = ans;
        }

        return answer;
    }
}