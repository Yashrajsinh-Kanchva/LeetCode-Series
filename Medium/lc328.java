public class lc328 {
    public static void main(String[] args) {
        ListNode328 l1=new ListNode328(1);
        l1.next=new ListNode328(2);
        l1.next.next=new ListNode328(3);
        l1.next.next.next=new ListNode328(4);
        l1.next.next.next.next=new ListNode328(5);

        Solution328 s=new Solution328();
        ListNode328 result=s.oddEvenList(l1);
        while(result!=null){
            System.out.print(result.val+" ");
            result=result.next;
        }
    }
}
class ListNode328 {
    int val;
    ListNode328 next;
    ListNode328(int val) { this.val = val; }
}class Solution328 {
    public ListNode328 oddEvenList(ListNode328 head) {

//        if(head==null || head.next==null) return head;
//
//        ListNode328 temp=head;
//        ListNode328 result=new ListNode328(0);
//        ListNode328 ans=result;
//
//        while(temp!=null){
//            result.next=new ListNode328(temp.val);
//            temp=(temp.next!=null) ? temp.next.next : null;
//            result=result.next;
//        }
//        temp=head.next;
//        while(temp!=null){
//            result.next=new ListNode328(temp.val);
//            temp=(temp.next!=null) ? temp.next.next : null;
//            result=result.next;
//        }
//
//        return ans.next;
        if(head==null) return null;
        ListNode328 odd=head;
        ListNode328 even=head.next;
        ListNode328 evenHead=head.next;

        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
}