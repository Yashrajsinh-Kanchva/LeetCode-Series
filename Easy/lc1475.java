public class lc1475 {
    public static void main(String[] args) {
        int[] price={10,1,1,6};
        Solution1475 s=new Solution1475();
        int[] fp=s.finalPrices(price);
        for(int i=0; i<fp.length; i++){
            System.out.print(fp[i]+" ");
        }
    }
}
class Solution1475 {
    public int[] finalPrices(int[] prices) {
        int[] result=new int[prices.length];
        for(int i=0; i<prices.length; i++){
            result[i]=prices[i];
            for(int j=i+1; j<prices.length; j++){
                if(prices[j]<=prices[i]){
                    result[i]=prices[i]-prices[j];
                    break;
                }
            }
        }
        return result;
    }
}