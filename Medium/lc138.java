import java.util.HashMap;

public class lc138 {
}
class Solution138 {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> hm=new HashMap<>();

        Node curr=head;
        while(curr!=null){
            hm.put(curr,new Node(curr.val));
            curr=curr.next;
        }

        curr=head;
        while(curr!=null){
            Node copy=hm.get(curr);
            copy.next=hm.get(curr.next);
            copy.random=hm.get(curr.random);
            curr=curr.next;
        }

        return hm.get(head);
    }
}
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}