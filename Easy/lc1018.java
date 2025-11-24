import java.util.ArrayList;
import java.util.List;

public class lc1018 {
    public static void main(String[] args) {
        Solution1018 s=new Solution1018();
        System.out.println(s.prefixesDivBy5(new int[]{0,1,1}));
    }
}
class Solution1018 {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans=new ArrayList<>();
        int n=0;
        for(int i:nums){
            n=(n*2+i)%5;
            if(n==0)
                ans.add(true);
            else
                ans.add(false);
        }
        return ans;
    }
}