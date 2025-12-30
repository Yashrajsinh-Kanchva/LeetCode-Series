import java.util.ArrayList;
import java.util.List;

public class lc89 {
    public static void main(String[] args) {
        Solution89 s=new Solution89();
        System.out.println(s.grayCode(2));
    }
}
class Solution89 {
    public List<Integer> grayCode(int n) {
        int size=1<<n;
        List<Integer> ans=new ArrayList<>();
        for(int i=0; i<size; i++)
            ans.add(i^(i>>1));
        return ans;
    }
}
