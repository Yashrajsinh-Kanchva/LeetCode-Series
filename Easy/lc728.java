import java.util.LinkedList;
import java.util.List;
public class lc728 {
    public static void main(String[] args) {
        Solution728 s=new Solution728();
        List<Integer> ans=s.selfDividingNumbers(1,22);
        System.out.println(ans);
    }
}
class Solution728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l1=new LinkedList<>();
        while(left!=right+1){
            if(check(left))
                l1.add(left);
            left++;
        }
        return l1;
    }
    boolean check(int num){
        int temp=num;
        while(temp>0){
            if(temp%10==0 || num%(temp%10)!=0)
                return false;
            temp/=10;
        }
        return true;
    }
}