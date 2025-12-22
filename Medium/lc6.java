public class lc6 {
    public static void main(String[] args) {
        Solution6 s=new Solution6();
        System.out.println(s.convert("PAYPALISHIRING",3));
    }
}
class Solution6 {
    public String convert(String s, int numRows) {
        if(numRows==1 || s.length()<=numRows) return s;

        StringBuilder[] rows=new StringBuilder[numRows];
        for(int i=0; i<numRows; i++)
            rows[i]=new StringBuilder();

        int currentRow=0;
        boolean down=false;

        for(char ch:s.toCharArray()){
            rows[currentRow].append(ch);

            if(currentRow==0 || currentRow==numRows-1)
                down=!down;

            currentRow+=down? 1: -1;
        }
        StringBuilder ans=new StringBuilder();
        for(StringBuilder st:rows)
            ans.append(st);

        return ans.toString();
    }
}