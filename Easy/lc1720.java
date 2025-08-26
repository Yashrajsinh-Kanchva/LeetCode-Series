public class lc1720 {
    public static void main(String[] args) {
        Solution1720 s=new Solution1720();
        int[] arr=s.decode(new int[]{1,2,3}, 1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
class Solution1720 {
    public int[] decode(int[] encoded, int first) {
        int[] ans=new int[encoded.length+1];
        ans[0]=first;
        for(int i=0; i<encoded.length; i++){
            ans[i+1]=encoded[i]^ans[i];
        }
        return ans;
    }
}
