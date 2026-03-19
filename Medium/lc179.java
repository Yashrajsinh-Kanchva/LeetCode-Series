import java.util.Arrays;

public class lc179 {
    public static void main(String[] args) {
        Solution179 s=new Solution179();
        System.out.println(s.largestNumber(new int[]{10,2}));
    }
}
class Solution179 {
    public String largestNumber(int[] nums) {
        String[] array =  new String[nums.length];
        for(int i=0; i<nums.length; i++){
            array[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(array,(a, b)-> (b+a).compareTo(a+b));
        if(array[0].equals("0")){
            return "0";
        }
        StringBuilder largest = new StringBuilder();
        for(int i=0; i<array.length; i++){
            largest.append(array[i]);
        }
        return largest.toString();
    }
}