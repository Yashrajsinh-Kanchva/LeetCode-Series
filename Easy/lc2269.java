public class lc2269 {
    public static void main(String[] args) {
        Solution2269 s=new Solution2269();
        System.out.println(s.divisorSubstrings(240,2));
    }
}
class Solution2269 {
    public int divisorSubstrings(int num, int k) {
        String n=num+"";
        int count=0;
        for(int i=0; i<=n.length()-k; i++){
            String check=n.substring(i,k+i);
            int no=Integer.parseInt(check);
            if(no!=0 && num%no==0) count++;
        }
        return count;
    }
}