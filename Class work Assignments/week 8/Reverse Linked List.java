class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode save;
            while(curr != null){
                save=curr.next; 
                curr.next=prev;
                //save.next=curr;
                prev=curr;
                curr=save;
            }
        return prev;
    }
}