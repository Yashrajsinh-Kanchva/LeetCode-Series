import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class lc2975 {
    public static void main(String[] args) {
        Solution2975 s=new Solution2975();
        System.out.println(s.maximizeSquareArea(4,3,new int[]{2,3},new int[]{2}));
    }
}
class Solution2975 {
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {

        // Add the outer boundaries of the field to the horizontal fence positions
        // This allows us to consider squares that touch the top or bottom edge
        int[] h = Arrays.copyOf(hFences, hFences.length + 2);
        h[hFences.length] = 1;
        h[hFences.length + 1] = m;


        // Add the outer boundaries of the field to the vertical fence positions
        // This allows us to consider squares that touch the left or right edge
        int[] v = Arrays.copyOf(vFences, vFences.length + 2);
        v[vFences.length] = 1;
        v[vFences.length + 1] = n;


        // Sort both fence arrays so distances can be calculated correctly
        Arrays.sort(h);
        Arrays.sort(v);

        // Compute every possible height that can be formed by removing horizontal fences
        // Each pair of horizontal fences defines one potential side length
        long maxSide = getMaxSide(h, v);

        // If no common side length was found, forming a square is impossible
        if (maxSide == -1) return -1;

        // Return the area of the largest square under the modulo constraint
        long MOD = 1_000_000_007;
        return (int) ((maxSide * maxSide) % MOD);
    }

    private static long getMaxSide(int[] h, int[] v) {
        Set<Integer> hGaps = new HashSet<>();
        for (int i = 0; i < h.length; i++) {
            for (int j = i + 1; j < h.length; j++) {
                hGaps.add(h[j] - h[i]);
            }
        }

        // For each possible vertical distance, check whether the same length
        // exists in the horizontal direction to form a valid square
        long maxSide = -1;
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                int currentGap = v[j] - v[i];
                if (hGaps.contains(currentGap)) {
                    maxSide = Math.max(maxSide, currentGap);
                }
            }
        }
        return maxSide;
    }
}