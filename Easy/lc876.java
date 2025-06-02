public class lc876 {
    public static void main(String[] args) {
        // list1: 1-->2-->3-->4-->5
        ListNode876 list1=new ListNode876(1);
        list1.next=new ListNode876(2);
        list1.next.next=new ListNode876(3);
        ListNode876 l=list1.next.next;
        l.next=new ListNode876(4);
        l.next.next=new ListNode876(5);
        Solution876 s=new Solution876();
        ListNode876 result1=s.middleNode(list1);

        // result1: 3-->4-->5
        while(result1!=null){
            System.out.print(result1.val+" ");
            result1=result1.next;
        }
        System.out.println();

        // list2: 1-->2-->3-->4-->5-->6
        ListNode876 list2=new ListNode876(1);
        list2.next=new ListNode876(2);
        list2.next.next=new ListNode876(3);
        ListNode876 l2=list2.next.next;
        l2.next=new ListNode876(4);
        l2.next.next=new ListNode876(5);
        l2.next.next.next=new ListNode876(6);
        ListNode876 result2=s.middleNode(list2);

        // result2: 4-->5-->6
        while(result2!=null){
            System.out.print(result2.val+" ");
            result2=result2.next;
        }
    }
}
class ListNode876 {
    int val;
    ListNode876 next;
    ListNode876(int x) { val = x; }
}
class Solution876 {
    public ListNode876 middleNode(ListNode876 head) {
        ListNode876 slow=head;
        ListNode876 fast=head;

        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast.next==null)
            return slow;
        else
            return slow.next;

    }
}
