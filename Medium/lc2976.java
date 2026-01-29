public class lc2976 {
    public static void main(String[] args) {
        Solution2976 s=new Solution2976();
        System.out.println(s.minimumCost("abcd","acbe",new char[]{'a','b','c','c','e','d'},new char[]{'b','c','b','e','b','e'},new int[]{2,5,5,1,2,20}));
    }
}
class Solution2976 {
    public long minimumCost(
            String source, String target,
            char[] original, char[] changed, int[] cost
    ) {
        long INF = (long)1e15;
        long[][] dist = new long[26][26];

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                dist[i][j] = (i == j) ? 0 : INF;
            }
        }

        for (int i = 0; i < original.length; i++) {
            int u = original[i] - 'a';
            int v = changed[i] - 'a';
            dist[u][v] = Math.min(dist[u][v], cost[i]);
        }

        for (int k = 0; k < 26; k++) {
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < 26; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        long ans = 0;
        for (int i = 0; i < source.length(); i++) {
            int s = source.charAt(i) - 'a';
            int t = target.charAt(i) - 'a';
            if (dist[s][t] == INF) return -1;
            ans += dist[s][t];
        }

        return ans;
    }
}
