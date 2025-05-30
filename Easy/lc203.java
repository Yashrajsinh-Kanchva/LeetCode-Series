import java.util.Scanner;

public class lc203 {
    public static void main(String[] args) {

        //list1: 1-->2-->6-->3-->4-->5-->6
        ListNode203 list1=new ListNode203(1);
        Scanner sc=new Scanner(System.in);
        ListNode203 l=list1;
        for(int i=1; i<=6; i++){
            int element=sc.nextInt();
            l.next=new ListNode203(element);
            l=l.next;
        }

        Solution203 s=new Solution203();
        // remove 6 from list1
        ListNode203 result=s.removeElements(list1, 6);

        //print list after deletion of 6 from list1
        while(result!=null){
            System.out.print(result.val+" ");
            result=result.next;
        }
    }
}
class ListNode203 {
    int val;
    ListNode203 next;
    ListNode203(int x) { val = x; }
}
class Solution203 {
    public ListNode203 removeElements(ListNode203 head, int val) {

        // for list like, l1: 1-->1-->1-->1  OR l2: empty list;
        while(head!=null && head.val==val)
            head=head.next;

        ListNode203 temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.next.val==val)
                temp.next=temp.next.next;
            else
                temp=temp.next;
        }
        return head;
    }
}
