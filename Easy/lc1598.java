public class lc1598 {
    public static void main(String[] args) {
        Solution1598 s=new Solution1598();
        String[] st={"d1/","../","../","../"};
        System.out.println(s.minOperations(st));
    }
}
class Solution1598 {
    public int minOperations(String[] logs) {
        int index=0;
        for (String log : logs) {
            if (!log.equals("../") && !log.equals("./")) {
                index++;
            } else if (log.equals("../") && index>0) {
                index--;
            }
        }

        return index;
    }
}
