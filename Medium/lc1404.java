public class lc1404 {
    public static void main(String[] args) {
        Solution1404 s=new Solution1404();
        System.out.println(s.numSteps("1101"));
    }
}
class Solution1404 {
    public int numSteps(String s) {
        int steps = 0, carry = 0;

        for (int i = s.length() - 1; i > 0; i--) {
            int bit = s.charAt(i) & 1;
            steps += 1 + (bit ^ carry);
            carry |= bit;
        }

        return steps + carry;
    }
}