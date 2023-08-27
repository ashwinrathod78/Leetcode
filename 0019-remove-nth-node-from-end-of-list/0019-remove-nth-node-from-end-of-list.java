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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode  newHead = new ListNode(0);
        ListNode first = newHead;
        first.next = head;
        
        if(head.next == null)
            return null;
        while(n!=0) {
            first = first.next;
            n--;
        }
        ListNode second = newHead;
        while(first.next != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return newHead.next;
    }
}