import java.util.ArrayList;
import java.util.List;

public class lc1441 {
    public static void main(String[] args) {
        Solution1441 s=new Solution1441();
        System.out.println(s.buildArray(new int[]{1,3},3));
    }
}
class Solution1441 {
    public List<String> buildArray(int[] target, int n) {
        int num=1;
        int i=0;
        List<String> ans=new ArrayList<>();
        while(i<target.length){
            if(target[i]==num){
                ans.add("Push");
                i++;
            }else{
                ans.add("Push");
                ans.add("Pop");
            }
            num++;
        }
        return ans;
    }
}
