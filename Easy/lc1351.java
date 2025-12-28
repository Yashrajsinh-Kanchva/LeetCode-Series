public class lc1351 {
    public static void main(String[] args) {
        Solution1351 s=new Solution1351();
        System.out.println(s.countNegatives(new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}));
    }
}
class Solution1351 {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int[] i:grid){
            for(int j=i.length-1; j>=0; j--){
                if(i[j]<0)
                    count++;
                else
                    break;
            }
        }
        return count;
    }
}