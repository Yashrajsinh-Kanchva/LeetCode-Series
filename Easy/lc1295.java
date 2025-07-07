public class lc1295 {
    public static void main(String[] args) {
        Solution1295 s=new Solution1295();
        int[] nums={12,345,2,6,7896};
        System.out.println(s.findNumbers(nums));
    }
}
class Solution1295 {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int n: nums){
            int c=0;
            int temp=n;
            while(temp>0){
                c++;
                temp/=10;
            }
            if(c%2==0)
                count++;
        }
        return count;
    }
}
