import java.util.ArrayList;
import java.util.List;

public class lc1622 {
    public static void main(String[] args) {
        Fancy obj=new Fancy();
        obj.append(2);
        obj.addAll(3);
        obj.append(7);
        obj.multAll(2);
        System.out.println(obj.getIndex(0));
        obj.addAll(3);
        obj.append(10);
        obj.multAll(2);
        System.out.println(obj.getIndex(0));
        System.out.println(obj.getIndex(1));
        System.out.println(obj.getIndex(2));
    }
}

class Fancy {

    List<Long> list;
    long add = 0;
    long mul = 1;
    long MOD = 1000000007;

    public Fancy() {
        list = new ArrayList<>();
    }

    public void append(int val) {
        long x = (val - add + MOD) % MOD;
        x = (x * modInverse(mul)) % MOD;
        list.add(x);
    }

    public void addAll(int inc) {
        add = (add + inc) % MOD;
    }

    public void multAll(int m) {
        mul = (mul * m) % MOD;
        add = (add * m) % MOD;
    }

    public int getIndex(int idx) {
        if (idx >= list.size()) return -1;
        long val = list.get(idx);
        return (int)((val * mul + add) % MOD);
    }

    private long modInverse(long x) {
        return pow(x, MOD - 2);
    }

    private long pow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) res = (res * a) % MOD;
            a = (a * a) % MOD;
            b >>= 1;
        }
        return res;
    }
}
/**
 * Your Fancy object will be instantiated and called as such:
 * Fancy obj = new Fancy();
 * obj.append(val);
 * obj.addAll(inc);
 * obj.multAll(m);
 * int param_4 = obj.getIndex(idx);
 */