import java.util.ArrayList;
import java.util.List;

public class lc228 {
    public static void main(String[] args) {
        Solution228 s=new Solution228();
        int[] nums={0,2,3,4,6,8,9};
        List<String> result=s.summaryRanges(nums);
        System.out.println(result);
    }
}
class Solution228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> s=new ArrayList<>();
        for(int i=0; i< nums.length; i++){
            StringBuilder s1=new StringBuilder();
            s1.append(nums[i]);
            boolean b=false;
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+1== nums[j]){
                    b=true;
                    i++;
                }
                else{
                    break;
                }
            }
            if(b){
                s1.append("->").append(nums[i]);
            }
            s.add(s1.toString());
        }
        return s;
    }
}
