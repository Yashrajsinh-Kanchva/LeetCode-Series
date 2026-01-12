public class lc1266 {
    public static void main(String[] args) {
        Solution1266 s=new Solution1266();
        System.out.println(s.minTimeToVisitAllPoints(new int[][]{{1,1},{3,4},{-1,0}}));
    }
}
class Solution1266 {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;

        for (int i = 0; i < points.length - 1; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            int x2 = points[i + 1][0];
            int y2 = points[i + 1][1];

            time += Math.max(Math.abs(x2 - x1), Math.abs(y2 - y1));
        }

        return time;
    }
}
