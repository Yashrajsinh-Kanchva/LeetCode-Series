import java.util.ArrayList;
import java.util.List;

public class lc401 {
    public static void main(String[] args) {
        Solution401 s=new Solution401();
        System.out.println(s.readBinaryWatch(1));
    }
}
class Solution401 {
    public List<String> readBinaryWatch(int k) {
        if (k == 0) return List.of("0:00");
        int mask = (1 << 6) - 1;
        int q = (1 << k) - 1;
        int limit = q << (10 - k);
        List<String> res = new ArrayList<>();

        while (q <= limit) {
            int min = q & mask;
            int hour = q >> 6;
            if (hour < 12 && min < 60)
                //res.add(String.format("%d:%02d", hour, min));
                res.add(hour + ":" + (min < 10 ? "0" : "") + min);
            int r = q & -q;
            int n = q + r;
            q = (((q ^ n) / r) >> 2) | n;
        }
        return res;
    }
}