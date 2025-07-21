public class lc1221 {
    public static void main(String[] args) {
        Solution1221 s=new Solution1221();
        System.out.println(s.balancedStringSplit("RLRRRLLRLL"));
    }
}
class Solution1221 {
    public int balancedStringSplit(String s) {
        int RL=0;
        int count=0;
        for(char ch: s.toCharArray()){
            if(ch=='R')
                RL++;
            else
                RL--;

            if(RL==0)
                count++;
        }
        return count;
    }
}
