public class lc206 {
    public static void main(String[] args) {
        // list1: 1-->2-->3
        ListNode206 list1=new ListNode206(1);
        list1.next=new ListNode206(2);
        list1.next.next=new ListNode206(3);

        Solution206 s=new Solution206();
        ListNode206 result=s.reverseList(list1);

        // result: 3-->2-->1
        while(result!=null){
            System.out.print(result.val+" ");
            result=result.next;
        }
    }
}
class ListNode206 {
    int val;
    ListNode206 next;
    ListNode206(int x) { val = x; }
}
class Solution206 {
    public ListNode206 reverseList(ListNode206 head) {
        ListNode206 prev=null;
        ListNode206 current=head;

        while(current!=null){
            ListNode206 nextNode=current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
        }

        return prev;
    }
}
