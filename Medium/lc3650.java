import java.util.*;

public class lc3650 {
    public static void main(String[] args) {
        Solution3650 s=new Solution3650();
        System.out.println(s.minCost(4, new int[][]{{0,1,3},{3,1,1},{2,3,4},{0,2,2}}));
    }
}
class Solution3650 {
    public int minCost(int n, int[][] edges) {
        List<List<Pair>> graph=new ArrayList<>();

        for(int i=0; i<n; i++) graph.add(new ArrayList<>());

        for(int[] i:edges){
            int u=i[0], v=i[1], w=i[2];
            graph.get(u).add(new Pair(v,w));
            graph.get(v).add(new Pair(u,2*w));
        }

        int[] dist=new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0]=0;

        PriorityQueue<Pair> pq=new PriorityQueue<>(Comparator.comparingInt(a -> a.cost));
        pq.add(new Pair(0,0));

        while(!pq.isEmpty()){
            Pair curr=pq.poll();
            int node=curr.node;
            int cost=curr.cost;

            if(node==(n-1)) return cost;
            if(cost>dist[node]) continue;

            for(Pair n1: graph.get(node)){
                int newCost=cost+n1.cost;
                if(newCost<dist[n1.node]){
                    dist[n1.node]=newCost;
                    pq.add(new Pair(n1.node,newCost));
                }
            }
        }
        return -1;
    }
}
class Pair{
    int node,cost;
    Pair(int node,int cost){
        this.cost=cost;
        this.node=node;
    }
}