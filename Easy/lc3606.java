import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lc3606 {
    public static void main(String[] args) {
        Solution3606 s=new Solution3606();
        System.out.println(s.validateCoupons(new String[]{"SAVE20","","PHARMA5","SAVE@20"}, new String[]{"restaurant","grocery","pharmacy","restaurant"}, new boolean[]{true,true,true,true}));
    }
}
class Solution3606 {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> ans=new ArrayList<>();

        List<String> e=new ArrayList<>();
        List<String> g=new ArrayList<>();
        List<String> p=new ArrayList<>();
        List<String> r=new ArrayList<>();
        for(int i=0; i<code.length; i++){
            if(checkCode(code[i]) && checkBusinessLine(businessLine[i]) && isActive[i]){
                if(businessLine[i].startsWith("e"))e.add(code[i]);
                if(businessLine[i].startsWith("g"))g.add(code[i]);
                if(businessLine[i].startsWith("p"))p.add(code[i]);
                if(businessLine[i].startsWith("r"))r.add(code[i]);
            }
        }

        Collections.sort(e);
        Collections.sort(g);
        Collections.sort(p);
        Collections.sort(r);
        ans.addAll(e);
        ans.addAll(g);
        ans.addAll(p);
        ans.addAll(r);
        return ans;
    }
    boolean checkCode(String code){
        if(code.isEmpty()) return false;
        for(int i=0; i<code.length(); i++){
            if(!Character.isLetterOrDigit(code.charAt(i)) && code.charAt(i)!='_')
                return false;
        }
        return true;
    }
    boolean checkBusinessLine(String b){
        return switch (b) {
            case "electronics", "grocery", "pharmacy", "restaurant" -> true;
            default -> false;
        };
    }
}