import java.util.ArrayList;
import java.util.List;

public class lc448 {
    public static void main(String[] args) {
        Solution448 s=new Solution448();
        int[] nums={4,3,2,7,8,2,3,1};
        List<Integer> result=s.findDisappearedNumbers(nums);
        System.out.println(result);
    }
}
class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int[] ans=new int[nums.length+1];
        for (int num : nums) {
            ans[num]++;
        }
        for(int i=1; i<ans.length; i++){
            if(ans[i]==0)
                list.add(i);
        }
        return list;
    }
}
