import java.util.HashSet;
import java.util.Set;

public class lc3217 {
    public static void main(String[] args) {
        ListNode3217 l=new ListNode3217(1);
        l.next=new ListNode3217(2);
        l.next.next=new ListNode3217(3);
        l.next.next.next=new ListNode3217(4);
        l.next.next.next.next=new ListNode3217(5);
        Solution3217 s=new Solution3217();
        ListNode3217 ans=s.modifiedList(new int[]{1,2,3}, l);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
}
class ListNode3217{
    int val;
    ListNode3217 next;
    ListNode3217(int val){
        this.val=val;
    }
}
class Solution3217 {
    public ListNode3217 modifiedList(int[] nums, ListNode3217 head) {
        Set<Integer> s=new HashSet<>();
        for(int i:nums)
            s.add(i);

        ListNode3217 ans=new ListNode3217(-1);
        ans.next=head;
        ListNode3217 temp=ans;

        while(temp.next!=null){
            if(s.contains(temp.next.val)){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return ans.next;
    }

}
