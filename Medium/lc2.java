public class lc2 {
    public static void main(String[] args) {
        ListNode2 l1=new ListNode2(2);
        l1.next=new ListNode2(4);
        l1.next.next=new ListNode2(3);

        ListNode2 l2=new ListNode2(5);
        l2.next=new ListNode2(6);
        l2.next.next=new ListNode2(4);

        Solution2 s=new Solution2();
        ListNode2 result=s.addTwoNumbers(l1, l2);
        while(result!=null){
            System.out.print(result.val+" ");
            result=result.next;
        }
    }
}
class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2(int x) { val = x; }
}
class Solution2 {
    public ListNode2 addTwoNumbers(ListNode2 l1, ListNode2 l2) {
        ListNode2 result=new ListNode2(0);
        ListNode2 ans=result;
        int carry=0;

        while(l1!=null && l2!=null){
            int sum=l1.val+l2.val+carry;
            if(sum/10>0){
                carry=sum/10;
                sum=sum%10;
            }else{
                carry=0;
            }
            result.next=new ListNode2(sum);
            result=result.next;
            l1=l1.next; l2=l2.next;
        }

        if(l1!=null){
            while(l1!=null){
                int sum=l1.val+carry;
                if(sum/10>0){
                    carry=sum/10;
                    sum=sum%10;
                }else{
                    carry=0;
                }
                result.next=new ListNode2(sum);
                result=result.next;
                l1=l1.next;
            }
        }

        if(l2!=null){
            while(l2!=null){
                int sum=l2.val+carry;
                if(sum/10>0){
                    carry=sum/10;
                    sum=sum%10;
                }else{
                    carry=0;
                }
                result.next=new ListNode2(sum);
                result=result.next;
                l2=l2.next;
            }
        }

        if(carry!=0){
            result.next =new ListNode2(carry);
        }

        return ans.next;
    }
}
