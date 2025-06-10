public class lc504 {
    public static void main(String[] args) {
        Solution504 s=new Solution504();
        System.out.println(s.convertToBase7(100));
    }
}
class Solution504 {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        boolean negative=num<0;
        if(negative)
            num=-num;
        StringBuilder ans=new StringBuilder();
        while(num>0){
            ans.insert(0,num%7);
            num/=7;
        }
        if(negative) ans.insert(0,"-");
        return ans.toString();
    }
}
