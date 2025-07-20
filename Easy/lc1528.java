public class lc1528 {
    public static void main(String[] args) {
        Solution1528 s=new Solution1528();
        int[] i={4,5,6,7,0,2,1,3};
        System.out.println(s.restoreString("codeleet",i));
    }
}
class Solution1528 {
    public String restoreString(String s, int[] indices) {
        char[] ans=new char[s.length()];
        for(int i=0; i<indices.length; i++){
            ans[indices[i]]=s.charAt(i);
        }
        return new String(ans);
    }
}
