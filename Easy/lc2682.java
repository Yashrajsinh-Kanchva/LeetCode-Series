import java.util.Hashtable;

public class lc2682 {
    public static void main(String[] args) {
        Solution2682 s=new Solution2682();
        int[] ans=s.circularGameLosers(5,2);
        for(int n: ans){
            System.out.print(n+" ");
        }
    }
}
class Solution2682 {
    public int[] circularGameLosers(int n, int k) {
        // 6ms
//        Hashtable<Integer, Integer> player=new Hashtable<>();
//        for(int i=1; i<=n; i++){
//            player.put(i, 0);
//        }
//        int start=1;
//        int step=k;
//        int I=2;
//        while(true){
//            int val=player.get(start);
//            player.put(start, ++val);
//            if(player.get(start)==2){
//                player.remove(start);
//                break;
//            }
//            start=start+step;
//            if(start>n)
//                start=(start % n == 0) ? n : start % n;
//
//            step=k*I;
//            I++;
//        }
//
//        int[] ans=new int[n-I+2];
//        int j=0;
//        for(int i=1; i<=n; i++){
//            if(player.containsKey(i) && player.get(i)==0){
//                ans[j++]=i;
//            }
//        }
//        return ans;

        //1ms
        boolean[] player=new boolean[n];
        player[0]=true;
        int i=1;
        int last=1;
        while(true){
            last= (last+(i*k))%n;
            if(last==0) last=n;
            if(player[last-1])
                break;
            i++;
            player[last-1]=true;
        }

        int ans[]= new int[n-i];
        int ansIndex=0;
        for(int j=0; j<n; j++){
            if(!player[j]){
                ans[ansIndex++]=j+1;
            }
        }
        return ans;
    }
}
