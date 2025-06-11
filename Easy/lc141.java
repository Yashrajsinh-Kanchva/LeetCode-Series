public class lc141 {
    public static void main(String[] args) {
        Solution141 s=new Solution141();
        ListNode141 list1=new ListNode141(1);
        list1.next=new ListNode141(2);
        list1.next.next=new ListNode141(3);
        list1.next.next.next=new ListNode141(4);
        list1.next.next.next.next=list1.next;
        System.out.println(s.hasCycle(list1));
    }
}
class ListNode141 {
    int val;
    ListNode141 next;
    ListNode141(int x) { val = x; }
}
class Solution141 {
    public boolean hasCycle(ListNode141 head) {
        if(head==null || head.next==null) return false;
        ListNode141 slow=head;
        ListNode141 fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) return true;
        }
        return false;
    }
}
