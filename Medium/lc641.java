public class lc641 {
    public static void main(String[] args) {
        MyCircularDeque obj = new MyCircularDeque(2);
        boolean param_1 = obj.insertFront(1);
        boolean param_2 = obj.insertLast(2);
        boolean param_3 = obj.deleteFront();
        boolean param_4 = obj.deleteLast();
        int param_5 = obj.getFront();
        int param_6 = obj.getRear();
        boolean param_7 = obj.isEmpty();
        boolean param_8 = obj.isFull();
    }
}
class MyCircularDeque {
    int f,r,size;
    int[] q;
    public MyCircularDeque(int k) {
        size=k;
        f=-1; r=-1;
        q=new int[size];
    }

    public boolean insertFront(int value) {
        if(f==(r+1)%size){
            return false;
        }
        else{
            if(f==-1)
                f=r=0;
            else if(f==0)
                f=size-1;
            else
                f--;
            q[f]=value;
        }
        return true;
    }

    public boolean insertLast(int value) {
        if(f==(r+1)%size){
            return false;
        }
        else{
            if(r==-1)
                f=0;
            r=(r+1)%size;
            q[r]=value;
            return true;
        }
    }

    public boolean deleteFront() {
        if(f==-1){
            return false;
        }
        if(f==r){
            f = r = -1;
        } else {
            f = (f + 1) % size;
        }
        return true;
    }

    public boolean deleteLast() {
        if(f==-1){
            return false;
        }
        if(f==r){
            f=r=-1;
        }
        else if(r==0){
            r=size-1;
        }
        else{
            r--;
        }
        return true;
    }

    public int getFront() {
        if(f==-1)
            return -1;
        return q[f];
    }

    public int getRear() {
        if(f==-1)
            return -1;
        return q[r];
    }

    public boolean isEmpty() {
        if(f==-1)
            return true;
        return false;
    }

    public boolean isFull() {
        if(f==(r+1)%size)
            return true;
        return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */