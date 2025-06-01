public class lc2011 {
    public static void main(String[] args) {
        Solution2011 s=new Solution2011();
        String[] Operation={"--X","X++","X++"};
        System.out.println(s.finalValueAfterOperations(Operation));
    }
}
class Solution2011 {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0; i<operations.length; i++){
            switch (operations[i]){
                case "++X":
                case "X++":
                    x++; break;
                case "--X":
                case "X--":
                    x--; break;
            }
        }
        return x;
    }
}
