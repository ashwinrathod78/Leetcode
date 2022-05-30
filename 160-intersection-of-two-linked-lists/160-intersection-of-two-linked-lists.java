/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = 1;
        ListNode curA = headA;
        while(curA != null) {
            countA++;
            curA = curA.next;
        }
        int countB = 1;
        ListNode curB = headB;
        while(curB != null) {
            countB++;
            curB = curB.next;
        }
        int moveLarger = 0;
        boolean moveA = false;
        if(countA > countB) {
            moveLarger = countA - countB;
            moveA = true;
        } else {
             moveLarger =  countB - countA;
        }
        ListNode a = headA;
        ListNode b = headB;
        if(moveA) {
            while(moveLarger > 0) {
                a = a.next;
                moveLarger--;
            }
        } else {
            while(moveLarger > 0) {
                b = b.next;
                moveLarger--;
            }
        }
        
        while(a != null && b!=null) {
            if(a==b)
                return a;
            a = a.next;
            b = b.next;
        }
        return null;
        
    }
}