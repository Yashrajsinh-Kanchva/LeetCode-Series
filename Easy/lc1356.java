import java.util.Arrays;

public class lc1356 {
    public static void main(String[] args) {
        Solution1356 s=new Solution1356();
        int[] ans=s.sortByBits(new int[]{0,1,2,3,4,5,6,7,8});
        for(int i:ans)
            System.out.print(i+" ");
    }
}
class Solution1356 {
    public int[] sortByBits(int[] arr) {
        Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(temp, (a, b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);

            if (countA == countB) {
                return a - b;
            }
            return countA - countB;
        });

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        return arr;
    }
}