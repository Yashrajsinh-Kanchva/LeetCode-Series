public class lc1486 {
    public static void main(String[] args) {
        Solution1486 s=new Solution1486();
        System.out.println(s.xorOperation(5,0));
    }
}
class Solution1486 {
    public int xorOperation(int n, int start) {
        int ans=0;
        for(int i=0; i<n; i++){
            ans^=(start + 2*i);
        }
        return ans;
    }
}
