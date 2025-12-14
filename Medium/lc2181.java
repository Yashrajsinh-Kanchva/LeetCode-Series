public class lc2181 {
    public static void main(String[] args) {
        Solution2181 s=new Solution2181();
        ListNode2181 l=new ListNode2181(0);
        l.next=new ListNode2181(1);
        l.next.next=new ListNode2181(0);
        l.next.next.next=new ListNode2181(3);
        l.next.next.next.next=new ListNode2181(0);
        ListNode2181 lContinue=l.next.next.next.next;
        lContinue.next=new ListNode2181(2);
        lContinue.next.next=new ListNode2181(2);
        lContinue.next.next.next=new ListNode2181(0);

        ListNode2181 ans=s.mergeNodes(l);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
}
class Solution2181 {
    public ListNode2181 mergeNodes(ListNode2181 head) {
        ListNode2181 ans=new ListNode2181(0);
        ListNode2181 dummy=ans;

        int sum=0;
        head=head.next;

        while(head!=null){
            if(head.val==0){
                dummy.next=new ListNode2181(sum);
                dummy=dummy.next;
                sum=0;
            }
            else{
                sum+=head.val;
            }
            head=head.next;
        }

        return ans.next;
    }
}
class ListNode2181{
    int val;
    ListNode2181 next;
    ListNode2181(int val){
        this.val=val;
        this.next=null;
    }
}
