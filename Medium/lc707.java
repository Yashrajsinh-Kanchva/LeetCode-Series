public class lc707 {
    public static void main(String[] args) {
        MyLinkedList ll=new MyLinkedList();
        ll.addAtHead(1); //1
        ll.addAtHead(0); // 0-->1
        ll.addAtTail(2); // 0-->1-->2
        ll.deleteAtIndex(1); // 0-->2
        ll.addAtIndex(1,3); // 0-->3-->2
        System.out.println(ll.get(2)); // 2
    }
}
class MyLinkedList {
    static class node{
        int data;
        node next;
        node(int data){
            next=null;
            this.data=data;
        }
    }
    node head=null;
    int size=0;
    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void addAtHead(int val) {
        node n1=new node(val);
        if(head==null)
            head=n1;
        else{
            n1.next=head;
            head=n1;
        }
        size++;
    }

    public void addAtTail(int val) {
        node n1=new node(val);
        if(head==null)
            head=n1;
        else{
            node temp=head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=n1;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;
        if(index==0){
            addAtHead(val);
            return;
        }
        else{
            node n1=new node(val);
            node temp1=head;
            int i=0;
            while(index!=(i+1)){
                temp1=temp1.next;
                i++;
            }
            n1.next=temp1.next;
            temp1.next=n1;
        }
        size++;
    }

    public void deleteAtIndex(int index) {
        if(index<0 || index>=size) return;
        if(index==0){
            head=head.next;
        }
        else{
            node temp1=head;
            int i=0;
            while(index!=(i+1)){
                temp1=temp1.next;
                i++;
            }
            node del=temp1.next;
            temp1.next=del.next;
            del.next=null;
        }
        size--;
    }
}

/*
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */