public class lc2095 {
    public static void main(String[] args) {
        ListNode2095 l1=new ListNode2095(1);
        l1.next=new ListNode2095(2);
        l1.next.next=new ListNode2095(3);
        Solution2095 s=new Solution2095();
        ListNode2095 result=s.deleteMiddle(l1);
        while(result!=null){
            System.out.print(result.val+" ");
            result=result.next;
        }
    }
}
class ListNode2095 {
    int val;
    ListNode2095 next;
    ListNode2095(int val) { this.val = val; }
}
class Solution2095 {
    public ListNode2095 deleteMiddle(ListNode2095 head) {
        ListNode2095 fast=head;
        ListNode2095 slow=head;
        ListNode2095 prev=null;
        if(head==null || head.next==null) return null;
        if(head.next.next==null){
            head.next=null; return head;
        }
        while(fast.next!=null && fast.next.next!=null){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
        }

        if(fast.next==null){
            prev.next=slow.next;
            slow.next=null;
            return head;
        }
        else{
            prev=slow;
            slow=slow.next;
            prev.next=slow.next;
            slow.next=null;
            return head;
        }
    }
}