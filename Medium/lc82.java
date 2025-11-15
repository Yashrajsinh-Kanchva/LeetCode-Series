public class lc82 {
    public static void main(String[] args) {
        ListNode82 l1=new ListNode82(1);
        l1.next=new ListNode82(2);
        l1.next.next=new ListNode82(3);
        l1.next.next.next=new ListNode82(3);
        l1.next.next.next.next=new ListNode82(4);
        l1.next.next.next.next.next=new ListNode82(4);
        l1.next.next.next.next.next.next=new ListNode82(5);
        Solution82 s=new Solution82();
        ListNode82 ans=s.deleteDuplicates(l1);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
}
class ListNode82 {
    int val;
    ListNode82 next;
    ListNode82(int val) { this.val = val; }
}
class Solution82 {
    public ListNode82 deleteDuplicates(ListNode82 head) {
        //1,2,3,3,4,4,5
        //1,1,1,2,3
        if(head==null || head.next==null) return head;
        ListNode82 temp=head;
        ListNode82 prev=head;
        while(temp!=null){
            int count=0;
            while(temp.next!=null && temp.val == temp.next.val){
                temp=temp.next;
                count++;
            }
            if(count>0){
                if(prev==head && prev.val==temp.val) {
                    prev = temp.next;
                    head=prev;
                }
                else {
                    prev.next = temp.next;
                }
            }
            else{
                prev=temp;
            }
            temp=temp.next;
        }
        return head;
    }
}