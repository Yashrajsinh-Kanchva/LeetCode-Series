import java.util.ArrayList;
import java.util.List;

public class lc2942 {
    public static void main(String[] args) {
        Solution2942 s=new Solution2942();
        String[] w={"leet","code"};
        List<Integer> a=s.findWordsContaining(w, 'e');
        System.out.println(a);
    }
}
class Solution2942 {
    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> ans=new ArrayList<>();
        for(int i=0; i<words.length; i++){
            String s=words[i];
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j)==x){
                    ans.add(i); break;
                }
            }
        }
        return ans;
    }
}
