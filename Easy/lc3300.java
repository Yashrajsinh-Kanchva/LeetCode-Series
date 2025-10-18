public class lc3300 {
    public static void main(String[] args) {
        Solution3300 s=new Solution3300();
        System.out.println(s.minElement(new int[]{10,12,13,14}));
    }
}
class Solution3300 {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            int sum=0;
            while(i>0){
                sum+=i%10;
                i/=10;
            }
            if(min>sum)
                min=sum;
        }
        return min;
    }
}
