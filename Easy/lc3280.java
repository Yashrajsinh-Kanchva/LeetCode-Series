public class lc3280 {
    public static void main(String[] args) {
        Solution3280 s=new Solution3280();
        System.out.println(s.convertDateToBinary("2080-02-29"));
    }
}
class Solution3280 {
    public String convertDateToBinary(String date) {
//        String[] d=date.split("-");
//        StringBuilder ans=new StringBuilder();
//        for(String s: d){
//            ans.append(binary(s)).append("-");
//        }
//        int l=ans.length();
//        ans.delete(l-1,l);
//        return ans.toString();
        String[] d=date.split("-");
        StringBuilder ans=new StringBuilder();
        ans.append(Integer.toBinaryString(Integer.parseInt(d[0])));
        ans.append("-");
        ans.append(Integer.toBinaryString(Integer.parseInt(d[1])));
        ans.append("-");
        ans.append(Integer.toBinaryString(Integer.parseInt(d[2])));
        return ans.toString();
    }
//    String binary(String num){
//        int n=Integer.parseInt(num);
//        String bin="";
//        while(n>0){
//            bin=n%2+bin;
//            n/=2;
//        }
//        return bin;
//    }
}
