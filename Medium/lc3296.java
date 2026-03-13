public class lc3296 {
    public static void main(String[] args) {
        Solution3296 s=new Solution3296();
        System.out.println(s.minNumberOfSeconds(4,new int[]{2,1,1}));
    }
}
class Solution3296 {

    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {

        long left = 1;
        long right = (long)1e18;
        long ans = right;

        while(left <= right){
            long mid = left + (right - left)/2;

            if(canReduce(mid, mountainHeight, workerTimes)){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return ans;
    }

    private boolean canReduce(long time, int mountainHeight, int[] workerTimes){

        long total = 0;

        for(int t : workerTimes){

            long val = (2 * time) / t;

            long k = (long)((Math.sqrt(1 + 4 * val) - 1) / 2);

            total += k;

            if(total >= mountainHeight)
                return true;
        }

        return total >= mountainHeight;
    }
}