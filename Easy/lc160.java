public class lc160 {
    public static void main(String[] args) {

        //common list3: 8-->9
        ListNode160 l3=new ListNode160(8);
        l3.next=new ListNode160(9);

        // lis1: 1-->2-->8-->9
        ListNode160 l1=new ListNode160(1);
        l1.next=new ListNode160(2);
        l1.next.next=l3;

        //list2: 1-->8-->9
        ListNode160 l2=new ListNode160(1);
        l2.next=l3;
        Solution160 s=new Solution160();

        // result: 8-->9
        ListNode160 result=s.getIntersectionNode(l1,l2);
        while(result!=null){
            System.out.print(result.val+" ");
            result=result.next;
        }
    }
}
class ListNode160 {
    int val;
    ListNode160 next;
    ListNode160(int x) { val = x; }
}
class Solution160 {
    public ListNode160 getIntersectionNode(ListNode160 headA, ListNode160 headB) {
        int countA=0;
        int countB=0;
        ListNode160 a=headA;
        ListNode160 b=headB;
        while(a!=null){
            countA++;
            a=a.next;
        }
        while(b!=null){
            countB++;
            b=b.next;
        }

        while(countA>countB){
            countA--;
            headA=headA.next;
        }

        while(countB>countA){
            countB--;
            headB=headB.next;
        }

        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}
