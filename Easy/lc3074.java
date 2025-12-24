import java.util.Arrays;

public class lc3074 {
    public static void main(String[] args) {
        Solution3074 s=new Solution3074();
        System.out.println(s.minimumBoxes(new int[]{1,3,2}, new int[]{4,3,1,5,2}));
    }
}
class Solution3074 {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int total=0;
        for(int x: apple)
            total+=x;

        int count=0;
        for(int i=capacity.length-1; i>=0; i--){
            total-=capacity[i];
            count++;
            if(total<=0) break;

        }

        return count;
    }
}