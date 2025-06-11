public class lc2073 {
    public static void main(String[] args) {
        Solution2073 s=new Solution2073();
        int[] t={2,3,2};
        System.out.println(s.timeRequiredToBuy(t, 2));
    }
}
class Solution2073 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time=0, i=0;
        while(true){
            if(tickets[i]!=0){
                tickets[i]--;
                time++;
            }
            if(tickets[k]==0) break;
            i++;
            i= (i==tickets.length)? 0 : i;
        }
        return time;
    }
}
