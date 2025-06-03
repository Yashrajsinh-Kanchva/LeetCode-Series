public class lc234 {
    public static void main(String[] args) {
        ListNode234 list1=new ListNode234(1);
        list1.next=new ListNode234(1);
        list1.next.next=new ListNode234(2);
        list1.next.next.next=new ListNode234(1);

        Solution234 s=new Solution234();
        System.out.println(s.isPalindrome(list1));
    }
}
class ListNode234 {
    int val;
    ListNode234 next;
    ListNode234(int x) { val = x; }
}
class Solution234 {
    public boolean isPalindrome(ListNode234 head) {

        if(head==null || head.next==null) return true;

        ListNode234 slow=head;
        ListNode234 fast=head;

        while (fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode234 prev=null;
        ListNode234 current=slow.next;

        while(current!=null) {
            ListNode234 nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        ListNode234 first=head, second=prev;
        while(first!=null && second!=null){
            if(first.val!=second.val)
                return false;
            first=first.next;
            second=second.next;
        }
        return true;
    }
}
