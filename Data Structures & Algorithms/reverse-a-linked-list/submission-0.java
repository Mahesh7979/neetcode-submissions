/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = head.next;
        ListNode next = head.next.next;
        head.next = null;
        while(prev!=null){
            prev.next = head;
            head = prev;
            prev = next;
            if(next!=null)
            next = next.next;
        }
        return head;
    }
}
