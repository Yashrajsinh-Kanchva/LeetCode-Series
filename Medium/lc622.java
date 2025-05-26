class MyCircularQueue {
    int size;
    int[] Q;
    int R,F;
    public MyCircularQueue(int k) {
        size=k;
        Q=new int[size];
        R=-1; F=-1;
    }

    public boolean enQueue(int value) {
        if(F==(R+1)%size){
            return false;
        }
        else{
            if(F==-1)
                F=0;
            R=(R+1)%size;
            Q[R]=value;
            return true;
        }
    }

    public boolean deQueue() {
        if(F==-1){
            return false;
        }
        if(F==R){
            F = R = -1;
        } else {
            F = (F + 1) % size;
        }
        return true;
    }

    public int Front() {
        return Q[F];
    }

    public int Rear() {
        return Q[R];
    }

    public boolean isEmpty() {
        if(F==-1)
            return true;
        return false;
    }

    public boolean isFull() {
        if(F==(R+1)%size)
            return true;
        return false;
    }
}
class lc622{
    public static void main(String[] args) {
        MyCircularQueue obj = new MyCircularQueue(5);
        System.out.println(obj.enQueue(1));
        System.out.println(obj.deQueue());
        obj.enQueue(2); obj.enQueue(5);
        System.out.println(obj.Front());
        System.out.println(obj.Rear());
        System.out.println(obj.isEmpty());
        System.out.println(obj.isFull());
    }
}
/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */