public class lc1961 {
    public static void main(String[] args) {
        Solution1961 s=new Solution1961();
        String[] words={"aa","aaaa","banana"};
        System.out.println(s.isPrefixString("a",words));
    }
}
class Solution1961 {
    public boolean isPrefixString(String s, String[] words) {
        String str="";
        for(String st: words){
            str=str.concat(st);
            if(str.length()>=s.length()){
                break;}
        }
        return str.equals(s);
    }
}
