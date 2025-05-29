import java.util.Arrays;

public class lc14 {
    public static void main(String[] args) {
        Solution14 S=new Solution14();
        String[] strs={"flower","flow","flight"};
        System.out.println(S.longestCommonPrefix(strs));
    }
}
class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        // Method-1;
//        if(strs==null || strs.length==0) return "";
//        String s1=strs[0];
//        for(int i=1; i< strs.length; i++){
//            StringBuilder common=new StringBuilder();
//            for(int j=0; j<Math.min(strs[i].length(),s1.length()); j++){
//                if(s1.charAt(j)==strs[i].charAt(j)){
//                    common.append(s1.charAt(j));
//                }
//                else{
//                    break;
//                }
//            }
//            s1=common.toString();
//        }
        StringBuilder common=new StringBuilder();
        Arrays.sort(strs);
        int i=0;
        while(i<strs[0].length()){
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
                common.append(strs[0].charAt(i));
                i++;}
            else {
                break;
            }
        }
        return common.toString();
    }
}