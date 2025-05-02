public class lc2169 {
    public static void main(String[] args) {
        Solution2169 t=new Solution2169();
        System.out.println(t.countOperations(2,3));
    }
}
class Solution2169 {
    public int countOperations(int num1, int num2) {
        int operation=0;
        while(num1!=0 && num2!=0) {
            if (num1 >= num2) {
                num1 -= num2;
                operation++;
            }
            else {
                num2 -= num1;
                operation++;
            }
        }
        return operation;
    }
}
