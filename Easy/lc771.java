public class lc771 {
    public static void main(String[] args) {
        Solution771 s=new Solution771();
        System.out.println(s.numJewelsInStones("aA","aAAbbbbb"));
    }
}
class Solution771 {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0; i<stones.length(); i++){
            char s=stones.charAt(i);
            for(char l:jewels.toCharArray()){
                if(s==l){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
