import java.util.Arrays;

public class lc3005 {
    public static void main(String[] args) {
        Solution3005 s=new Solution3005();
        System.out.println(s.maxFrequencyElements(new int[]{1,2,2,3,1,4}));
    }
}
class Solution3005 {
    public int maxFrequencyElements(int[] nums) {
        int[] count=new int[101];
        for(int n:nums)
            count[n]++;
        Arrays.sort(count);
        int max=count[100];
        int ans=0;
        for(int i=100; i>=0; i--){
            if(count[i]==max)
                ans+=count[i];
            else
                break;
        }
        return ans;
    }
}
