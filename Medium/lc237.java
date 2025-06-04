class ListNode237 {
    int val;
    ListNode237 next;
    ListNode237(int val) { this.val = val; }
}
class Solution237 {
    public void deleteNode(ListNode237 node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}