import java.util.Arrays;
import java.util.HashMap;

public class lc2418 {
    public static void main(String[] args) {
        Solution2418 s=new Solution2418();
        String[] ans=s.sortPeople(new String[]{"Mary","John","Emma"}, new int[]{180,165,170});
        for(String a: ans)
            System.out.print(a+", ");
    }
}
class Solution2418 {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> hm=new HashMap<>();
        for(int i=0; i<names.length; i++)
            hm.put(heights[i], names[i]);

        Arrays.sort(heights);
        String[] ans=new String[names.length];
        int j= heights.length-1;
        for(int k:heights)
            ans[j--]=hm.get(k);

        return ans;
    }
}
