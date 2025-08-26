public class lc1688 {
    public static void main(String[] args) {
        Solution1688 s=new Solution1688();
        System.out.println(s.numberOfMatches(14));
    }
}
class Solution1688 {
    public int numberOfMatches(int n) {
        int matches=0;
        while(n!=1){
            int team;
            if(n%2!=0)
                team=(n-1)/2;
            else
                team=n/2;
            matches+=team;
            n-=team;
        }
        return matches;
    }
}
