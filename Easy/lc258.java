public class lc258 {
    public static void main(String[] args) {
        Solution258 t=new Solution258();
        System.out.println(t.addDigits(0));
    }
}
class Solution258 {
    public int addDigits(int num) {
        int sum=0;
        int count=0;
        do{
            sum=0;
            while(num>0){
                int r=num%10;
                sum+=r;
                num/=10;
            }
            count++;
            num=sum;
        }while(sum>9);
        return sum;
    }
}
