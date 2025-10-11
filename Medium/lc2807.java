public class lc2807 {
    public static void main(String[] args) {
        Solution2807 s=new Solution2807();

        // l : 18 -> 6 -> 10 -> 3
        ListNode2807 l=new ListNode2807(18);
        l.next=new ListNode2807(6);
        l.next.next=new ListNode2807(10);
        l.next.next.next=new ListNode2807(3);

        // ans : 18 -> 6 -> 6 -> 2 -> 10 -> 1 -> 3
        ListNode2807 ans=s.insertGreatestCommonDivisors(l);
        while (ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
}
class Solution2807 {
    public ListNode2807 insertGreatestCommonDivisors(ListNode2807 head) {
        ListNode2807 temp=head;

        while(temp.next!=null) {
            int gcd = gcd(temp.val, temp.next.val);
            ListNode2807 newNode = new ListNode2807(gcd);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = newNode.next;
        }

        return head;
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
class ListNode2807{
    int val;
    ListNode2807 next;
    ListNode2807(int val){
        this.val=val;
        this.next=null;
    }
}