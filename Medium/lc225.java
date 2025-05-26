import java.util.LinkedList;
import java.util.Queue;

public class lc225 {
    public static void main(String[] args) {
        MyStack obj=new MyStack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        //1
        System.out.println(obj.top());//2
        System.out.println(obj.pop());
        System.out.println(obj.empty());//false
    }
}
class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    int top;
    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
        top=-1;
    }

    public void push(int x) {
        if(top==-1){
            top++;
            q1.add(x);
        }
        else{
            while (!q1.isEmpty()){
                q2.add(q1.remove());
            }
            q1.add(x);
            while (!q2.isEmpty()){
                q1.add(q2.remove());
            }
        }
    }

    public int pop() {
        return q1.remove();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
