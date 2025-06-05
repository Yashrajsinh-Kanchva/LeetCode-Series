public class lc1381 {
    public static void main(String[] args) {
        CustomStack cs=new CustomStack(3);
        cs.push(1); cs.display();
        cs.push(2); cs.display();
        System.out.println(cs.pop());
        cs.push(2); cs.push(3); cs.push(4);
        cs.display();
        cs.increment(5,100); cs.display();
        cs.increment(2, 100); cs.display();
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
    }
}
class CustomStack {
    int[] stack;
    int top;
    public CustomStack(int maxSize) {
        stack=new int[maxSize];
        top=-1;
    }

    public void push(int x) {
        if(top<stack.length-1){
            stack[++top]=x;
        }
    }

    public int pop() {
        if(top<0)
            return -1;
        else
            return stack[top--];

    }

    public void increment(int k, int val) {
        if(k>top){
            for(int i=0; i<=top; i++)
                stack[i]+=val;
        }
        else{
            for(int i=0; i<k; i++)
                stack[i]+=val;
        }
    }
    void display(){
        for(int i=0; i<=top; i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
}