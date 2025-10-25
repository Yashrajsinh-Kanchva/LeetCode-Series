public class lc2698 {
    public static void main(String[] args) {
        Solution2698 s=new Solution2698();
        System.out.println(s.punishmentNumber(37));
    }
}
class Solution2698 {
    public int punishmentNumber(int n) {
        int[] arr = {1,9,10,36,45,55,82,91,99,100,235,297,369,370,379,414,657,675,703,756,792,909,918,945,964,990,991,999,1000};
        int sum = 0;
        for (int j : arr) {
            if (j <= n) sum += j * j;
            else break;
        }
        return sum;
    }
}
