import java.util.Stack;

public class lc232 {
    public static void main(String[] args) {
        MyQueue obj=new MyQueue();
        obj.push(1);
        obj.push(2);
        System.out.println(obj.pop());//1
        System.out.println(obj.peek());//2
        System.out.println(obj.empty());//false

    }
}
class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    int top;
    public MyQueue() {
        s1=new Stack<>();
        s2=new Stack<>();
        top=-1;
    }

    public void push(int x) {
        if(top==-1){
            top++;
            s1.push(x);
        }
        else{
            while(!s1.isEmpty()){
                int y=s1.pop();
                s2.push(y);
            }
            top++;
            s1.push(x);
            while(!s2.isEmpty()){
                int y=s2.pop();
                s1.push(y);
            }
        }
    }

    public int pop() {
        if(top==-1)
            return -1;
        return s1.pop();
    }

    public int peek() {
        return s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */