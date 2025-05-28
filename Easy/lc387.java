import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class lc387 {
    public static void main(String[] args) {
        Solution387 s=new Solution387();
        System.out.println(s.firstUniqChar("loveleetcode"));
    }
}
class Solution387 {
    public int firstUniqChar(String s) {
        int[] frequency=new int[26];
        for(char c: s.toCharArray()){
            frequency[c-'a']++;
        }
        for(int i=0; i<s.length(); i++){
            if(frequency[s.charAt(i)-'a']==1)
                return i;
        }
        return -1;
    }
}