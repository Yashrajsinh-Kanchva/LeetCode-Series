public class lc1290 {
    public static void main(String[] args) {
        Solution1290 s=new Solution1290();
        ListNode1290 l1=new ListNode1290(1);
        l1.next=new ListNode1290(0);
        l1.next.next=new ListNode1290(1);
        System.out.println(s.getDecimalValue(l1));
    }
}
class ListNode1290 {
    int val;
    ListNode1290 next;
    ListNode1290(int x) { val = x; }
}
class Solution1290 {
    public int getDecimalValue(ListNode1290 head) {
        ListNode1290 temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }

        int ans=0;
        temp=head;
        while(temp!=null){
            ans+=temp.val * (int)Math.pow(2, --count);
            temp=temp.next;
        }

        return ans;
    }
}
