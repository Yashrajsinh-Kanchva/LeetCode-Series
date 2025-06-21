import java.util.HashSet;
import java.util.Set;

public class lc1684 {
    public static void main(String[] args) {
        Solution1684 s=new Solution1684();
        String[] words={"ad","bd","aaab","baa","badab"};
        System.out.println(s.countConsistentStrings("ab", words));
    }
}
class Solution1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        Set<Character> s=new HashSet<>();
        for(char ch: allowed.toCharArray()){
            s.add(ch);
        }

        for(String w: words){
            boolean ans=true;
            for(char ch: w.toCharArray()){
                if(!s.contains(ch)){
                    ans=false;
                    break;
                }
            }
            if(ans)
                count++;
        }

        return count;
    }
}