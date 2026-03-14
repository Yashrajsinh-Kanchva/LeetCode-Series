public class lc1415 {
    public static void main(String[] args) {
        Solution1415 s=new Solution1415();
        System.out.println(s.getHappyString(1,3));
    }
}
class Solution1415 {

    int count = 0;
    String ans = "";

    public String getHappyString(int n, int k) {
        backtrack("", n, k);
        return ans;
    }

    private void backtrack(String curr, int n, int k) {

        if(curr.length() == n) {
            count++;

            if(count == k) {
                ans = curr;
            }
            return;
        }

        for(char ch : new char[]{'a','b','c'}) {

            if(curr.length() > 0 && curr.charAt(curr.length()-1) == ch)
                continue;

            backtrack(curr + ch, n, k);

            if(!ans.equals("")) return; // stop early
        }
    }
}