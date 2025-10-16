public class lc1342 {
    public static void main(String[] args) {
        Solution1342 s=new Solution1342();
        System.out.println(s.numberOfSteps(123));
    }
}
class Solution1342 {
    public int numberOfSteps(int num) {
        int count=0;

        while(num!=0){
            if(num%2==0)
                num/=2;
            else
                num-=1;
            count++;
        }
        return count;
    }
}
