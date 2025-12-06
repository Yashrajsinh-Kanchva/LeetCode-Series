import java.util.Stack;
class MinStack {
    Stack<Integer> s;
    Stack<Integer> minStack;
    public MinStack() {
        s=new Stack<>();
        minStack=new Stack<>();
    }

    public void push(int val) {
        if(minStack.isEmpty() || val<minStack.peek())
            minStack.push(val);
        else
            minStack.push(minStack.peek());
        s.push(val);
    }

    public void pop() {
        s.pop();
        minStack.pop();
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
