public class lc3453 {
    public static void main(String[] args) {
        Solution3453 s=new Solution3453();
        System.out.println(s.separateSquares(new int[][]{{0,0,1},{2,2,1}}));
    }
}
class Solution3453 {
    public double separateSquares(int[][] squares) {
        double totalArea = 0;
        double low = Double.MAX_VALUE;
        double high = Double.MIN_VALUE;

        // Compute total area and Y bounds
        for (int[] s : squares) {
            double y = s[1];
            double l = s[2];
            totalArea += l * l;
            low = Math.min(low, y);
            high = Math.max(high, y + l);
        }

        double target = totalArea / 2.0;

        // Binary search for Y
        for (int i = 0; i < 60; i++) { // enough for 1e-5 precision
            double mid = (low + high) / 2.0;

            if (areaBelow(squares, mid) < target) {
                low = mid;
            } else {
                high = mid;
            }
        }

        return low;
    }

    private double areaBelow(int[][] squares, double yLine) {
        double area = 0;

        for (int[] s : squares) {
            double y = s[1];
            double l = s[2];

            if (yLine <= y) {
                continue;
            } else if (yLine >= y + l) {
                area += l * l;
            } else {
                area += (yLine - y) * l;
            }
        }
        return area;
    }
}
