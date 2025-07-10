public class lc1716 {
    public static void main(String[] args) {
        Solution1716 s=new Solution1716();
        System.out.println(s.totalMoney(10));
    }
}
class Solution1716 {
    public int totalMoney(int n) {
        int money=0;
        int day=1, moneySaved=1, temp=1;
        for(int i=1; i<=n; i++){
            if(day<8){
                money+=moneySaved;
                day++;
                moneySaved++;
            }else{
                moneySaved=++temp;
                day=1;
                i--;
            }
        }
        return money;
    }
}