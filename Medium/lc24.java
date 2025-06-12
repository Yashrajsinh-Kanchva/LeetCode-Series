public class lc24 {
    public static void main(String[] args) {
        ListNode24 l1=new ListNode24(1);
        l1.next=new ListNode24(2);
        l1.next.next=new ListNode24(3);
        //l1.next.next.next=new ListNode24(4);
        Solution24 s=new Solution24();

        ListNode24 result=s.swapPairs(l1);
        while(result!=null){
            System.out.print(result.val+" ");
            result=result.next;
        }
    }
}
class ListNode24 {
    int val;
    ListNode24 next;

    ListNode24(int val) {
        this.val = val;
    }
}
class Solution24 {
    public ListNode24 swapPairs(ListNode24 head) {

        if(head==null || head.next==null) return head;

        ListNode24 prev=null;
        ListNode24 temp=head;
        ListNode24 tempNext=temp.next;
        head=tempNext;
        while(temp!=null &&tempNext != null){
            temp.next=tempNext.next;
            tempNext.next=temp;
            if(prev!=null) prev.next=tempNext;
            prev=temp;
            temp=temp.next;
            if(temp!=null)
                tempNext=temp.next;
        }
        return head;
    }
}