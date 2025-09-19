public class lc61 {
    public static void main(String[] args) {

        //l1: 0->1->2
        ListNode61 l1=new ListNode61(0);
        l1.next=new ListNode61(1);
        l1.next.next=new ListNode61(2);
        Solution61 s=new Solution61();
        ListNode61 ans=s.rotateRight(l1,4);

        //ans: 2->0->1
        while(ans!=null){
            System.out.println(ans.val);
            ans=ans.next;
        }

    }
}
class ListNode61 {
    int val;
    ListNode61 next;
    ListNode61(int x) { val = x; }
}
class Solution61 {
    public ListNode61 rotateRight(ListNode61 head, int k) {

        if (head == null || head.next == null) return head;

        ListNode61 temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
        temp.next=head;
        k=k%length;
        k=length-k;

        while(k-- >0)
            temp=temp.next;

        head=temp.next;
        temp.next=null;
        return head;
    }
}
