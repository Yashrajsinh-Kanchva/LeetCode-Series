public class lc83 {
    public static void main(String[] args) {
        // list1: 1-->1-->2-->3-->3
        ListNode83 list1=new ListNode83(1);
        list1.next=new ListNode83(1);
        list1.next.next=new ListNode83(2);
        ListNode83 Q=list1.next.next;
        Q.next=new ListNode83(3);
        Q.next.next=new ListNode83(3);

        Solution83 s=new Solution83();
        ListNode83 list=s.deleteDuplicates(list1);
        //duplicates deleted list:
        // list: 1-->2-->3
        while(list.next!=null){
            System.out.print(list.val+" ");
            list=list.next;
        }
        System.out.println(list.val);
    }
}
class ListNode83 {
    int val;
    ListNode83 next;
    ListNode83(int x) { val = x; }
}
class Solution83 {
    public ListNode83 deleteDuplicates(ListNode83 head) {
        ListNode83 result=head;
        while(result!=null && result.next!=null){
            if(result.val==result.next.val)
                result.next=result.next.next;
            else
                result=result.next;
        }
        return head;
    }
}
