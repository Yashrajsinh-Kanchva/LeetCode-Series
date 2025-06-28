import java.util.List;
public class lc2824 {
}
class Solution2824 {
    public int countPairs(List<Integer> nums, int target) {
        int length=nums.size();
        int count=0;
        for(int i=0; i<length; i++){
            for(int j=i+1; j<length; j++){
                if(nums.get(i)+nums.get(j)<target)
                    count++;
            }
        }
        return count;
    }
}