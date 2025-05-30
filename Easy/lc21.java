public class lc21 {
    public static void main(String[] args) {
        // list1: 1-->2-->4
        ListNode list1=new ListNode(1);
        list1.next=new ListNode(2);
        list1.next.next=new ListNode(4);
        // list2: 1-->3-->4
        ListNode list2=new ListNode(1);
        list2.next=new ListNode(3);
        list2.next.next=new ListNode(4);

        Solution21 s=new Solution21();
        ListNode merge=s.mergeTwoLists(list1,list2);

        while(merge.next!=null){
            System.out.print(merge.val+"-->");
            merge=merge.next;
        }
        System.out.println(merge.val);
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode(0);
        ListNode temp=head;

        while(list1!=null && list2!=null){
            if(list1.val<= list2.val){
                temp.next=list1;
                list1=list1.next;
            }
            else{
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        if(list1!=null) temp.next=list1;
        if(list2!=null) temp.next=list2;
        return head.next;
    }
}