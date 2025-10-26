public class lc2043 {
    public static void main(String[] args) {
        Bank obj = new Bank(new long[]{10, 100, 20, 50, 30});
        System.out.println(obj.withdraw(3,10)+" "+obj.transfer(5,1,20)+" "+obj.deposit(5,20)+" "+ obj.transfer(3,4,15)+" "+obj.withdraw(10,50));
    }
}
class Bank {
    long[] balance;
    int l;
    public Bank(long[] balance) {
        this.balance=balance;
        l= balance.length;
    }

    public boolean transfer(int account1, int account2, long money) {
        if(account1<=l && account2<=l && balance[account1-1]>=money){
            balance[account1-1]-=money;
            balance[account2-1]+=money;
            return true;
        }
        return false;
    }

    public boolean deposit(int account, long money) {
        if(account<=l){
            balance[account-1]+=money;
            return true;
        }
        return false;
    }

    public boolean withdraw(int account, long money) {
        if(account<=l && balance[account-1]>=money){
            balance[account-1]-=money;
            return true;
        }
        return false;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */
