import java.util.HashSet;
import java.util.Set;
public class lc2442 {
    public static void main(String[] args) {
        Solution2442 s=new Solution2442();
        System.out.println(s.countDistinctIntegers(new int[]{1,13,10,12,31}));
    }
}
class Solution2442 {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> B = new HashSet<>();

        for (int c : nums) {
            int C = reverse(c);
            B.add(c);
            B.add(C);
        }

        return B.size();
    }

    private int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev;
    }
}
