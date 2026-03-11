public class lc1099 {
    public static void main(String[] args) {
        Solution1099 s=new Solution1099();
        System.out.println(s.bitwiseComplement(5));
    }
}
class Solution1099 {
    public int bitwiseComplement(int n) {
        String binary=decimalToBinary(n);
        StringBuilder num= new StringBuilder();
        for(char ch: binary.toCharArray()){
            if(ch=='0')
                num.append("1");
            else
                num.append("0");
        }
        return binaryToDecimal(num.toString(),0);
    }
    String decimalToBinary(int n) {
        if (n == 0)
            return "";

        return decimalToBinary(n / 2) + (n % 2);
    }
    int binaryToDecimal(String bin, int index) {

        if (index == bin.length())
            return 0;

        return (bin.charAt(index) - '0') * (int)Math.pow(2, bin.length() - index - 1)
                + binaryToDecimal(bin, index + 1);
    }
}