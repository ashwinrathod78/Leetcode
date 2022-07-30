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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur = head;
        int count = 0;
        while(count < k) {
            if(cur == null)
                return head;
            cur = cur.next;
            count = count + 1;
        }
        
        ListNode prev = reverseKGroup(cur,k);
        while(count > 0) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
            count = count - 1;
        }
        
        return prev;
    }
}