import java.util.ArrayList;
import java.util.List;

public class lc119 {
    public static void main(String[] args) {
        Solution119 s=new Solution119();
        System.out.println(s.getRow(3));
    }
}
class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list=new ArrayList<>();
        for(int j=0; j<=rowIndex; j++){
            list.add(nCr(rowIndex,j));
        }
        return list;
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
