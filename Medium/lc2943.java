import java.util.Arrays;

public class lc2943 {
    public static void main(String[] args) {
        Solution2943 s=new Solution2943();
        System.out.println(s.maximizeSquareHoleArea(2,1,new int[]{2,3}, new int[]{2}));
    }
}
class Solution2943 {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        Arrays.sort(hBars);
        Arrays.sort(vBars);
        int s = Math.min(maxSpan(hBars), maxSpan(vBars));
        return s * s;
    }

    private int maxSpan(int[] bars) {
        int res = 1, streak = 1;
        for (int i = 1; i < bars.length; i++) {
            if (bars[i] - bars[i - 1] == 1) streak++;
            else streak = 1;
            res = Math.max(res, streak);
        }
        return ++res;
    }
}