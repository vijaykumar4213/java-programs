class Solution {
    public ListNode reverseList(ListNode head) {
          ListNode past=null;
        ListNode curr=head;
        ListNode next=null;
        while(curr!= null)
        {
            next=curr.next;
            curr.next=past;
            past=curr;
            curr=next;
        }
        head=past;
        return head;
        
    }
}
        
    
