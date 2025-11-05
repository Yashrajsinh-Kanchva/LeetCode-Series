import java.util.ArrayList;
import java.util.List;

public class lc118 {
    public static void main(String[] args) {
        Solution118 s=new Solution118();
        System.out.println(s.generate(5));
    }
}
class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0; j<=i; j++){
                list.add(nCr(i,j));
            }
            ans.add(list);
        }
        return ans;
    }
    int nCr(int n,int r){
        if (r > n - r) r = n - r;
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i) / (i + 1);
        }
        return (int)res;
    }
}
