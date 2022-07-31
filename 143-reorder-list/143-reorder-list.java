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
    public void reorderList(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode reverseNode = reverse(slow);
        ListNode tail = new ListNode(0);
        ListNode newHead = tail;
        boolean even = false;
        while(reverseNode != null && head != null) {
            if(even) { 
                tail.next = reverseNode;
                reverseNode = reverseNode.next;
                even = false;
            } else {
                tail.next = head;
                head = head.next;
                even = true;
            }
            tail = tail.next;
        }
       head = newHead.next;   
    }
    
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}