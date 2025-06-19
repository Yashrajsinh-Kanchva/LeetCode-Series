public class lc1108 {
    public static void main(String[] args) {
        Solution1108 s=new Solution1108();
        System.out.println(s.defangIPaddr("1.1.1.1"));
    }
}
class Solution1108 {
    public String defangIPaddr(String address) {
        String[] words=address.split("\\.");
        StringBuilder ans=new StringBuilder();
        int i=0;
        for(i=0; i<words.length-1; i++){
            ans.append(words[i]).append("[.]");
        }
        ans.append(words[i]);

        return ans.toString();
    }
}
