import java.util.Stack;

public class lc682 {
    public static void main(String[] args) {
        Solution682 s=new Solution682();
        String[] op={"5","-2","4","C","D","9","+","+"};
        System.out.println(s.calPoints(op));
    }
}
class Solution682 {
    public int calPoints(String[] operations) {
        int point=0;
        Stack<Integer> score=new Stack<>();
        for (String s : operations) {
            switch (s) {
                case "D":
                    int doubleNo = score.peek() * 2;
                    score.push(doubleNo);
                    point += doubleNo;
                    break;
                case "C":
                    int del = score.pop();
                    point -= del;
                    break;
                case "+":
                    int size = score.size();
                    int sum = score.elementAt(size - 1) + score.elementAt(size - 2);
                    score.push(sum);
                    point += sum;
                    break;
                default:
                    int n = Integer.parseInt(s);
                    score.push(n);
                    point += n;
                    break;
            }
        }
        return point;
    }
}
