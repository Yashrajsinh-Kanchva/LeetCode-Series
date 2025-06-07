public class lc121 {
    public static void main(String[] args) {
        Solution121 s=new Solution121();
        int[] prices={2,4,1};
        System.out.println(s.maxProfit(prices));
    }
}
class Solution121 {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else{
                profit= Math.max(prices[i]-min, profit);
            }
        }
        return profit;
    }
}
