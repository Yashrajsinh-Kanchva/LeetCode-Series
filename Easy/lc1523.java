public class lc1523 {
    public static void main(String[] args) {
        Solution1523 s=new Solution1523();
        System.out.println(s.countOdds(3,7));
    }
}
class Solution1523 {
    public int countOdds(int low, int high) {
        int range=high-low+1;
        if(low%2==1 && high%2==1){
            return (range/2)+1;
        }
        return range/2;
    }
}