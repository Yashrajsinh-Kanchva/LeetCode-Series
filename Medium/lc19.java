public class lc19 {
    public static void main(String[] args) {
        // list1: 1-->2-->3-->4-->5
        ListNode19 list1=new ListNode19(1);
        list1.next=new ListNode19(2);
        list1.next.next=new ListNode19(3);
        ListNode19 l=list1.next.next;
        l.next=new ListNode19(4);
        l.next.next=new ListNode19(5);
        Solution19 s=new Solution19();
        ListNode19 result1=s.removeNthFromEnd(list1, 2);
        // result1: 1-->2-->3-->5
        while(result1!=null){
            System.out.print(result1.val+" ");
            result1=result1.next;
        }
        System.out.println();
        ListNode19 list2=new ListNode19(1);
        list2.next=new ListNode19(2);
        ListNode19 result2=s.removeNthFromEnd(list2, 1);

        while(result2!=null){
            System.out.print(result2.val+" ");
            result2=result2.next;
        }
    }
}
class ListNode19 {
      int val;
      ListNode19 next;
      ListNode19(int val) { this.val = val; }
  }
class Solution19 {
    public ListNode19 removeNthFromEnd(ListNode19 head, int n) {
        ListNode19 result=new ListNode19(0);
        result.next=head;
        ListNode19 slow=result; ListNode19 fast=result;

        for(int i=0; i<=n; i++){
            fast=fast.next;
        }
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return result.next;
    }
}
