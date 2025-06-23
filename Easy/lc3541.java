import java.util.HashMap;

public class lc3541 {
    public static void main(String[] args) {
        Solution3541 s=new Solution3541();
        System.out.println(s.maxFreqSum("successes"));
    }
}
class Solution3541 {
    public int maxFreqSum(String s) {
        int maxVowel=0;
        int maxConsonant=0;
        HashMap<Character, Integer> hm=new HashMap<>();
        for(char c:s.toCharArray()){
            if(hm.containsKey(c)){
                int n=hm.get(c);
                hm.put(c,++n);
            }else{
                hm.put(c, 1);
            }
        }

        for(char c:hm.keySet()){
            switch (c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    maxVowel=Math.max(maxVowel, hm.get(c));
                    break;
                default:
                    maxConsonant=Math.max(maxConsonant, hm.get(c));
            }
        }
        return maxConsonant+maxVowel;
    }
}
