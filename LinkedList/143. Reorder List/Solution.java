/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        ListNode temp = head;
        while (temp.next != slow) {
            temp = temp.next;
        }
        temp.next = null;

        ListNode curr = slow;
        ListNode prev = null;
        ListNode fwd = null;
        while (curr != null) {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        ListNode first = head;
        ListNode second = prev;
        ListNode t1 = first;
        ListNode t2 = second;
        while (t2 != null && t1 != null) {
            ListNode next1 = t1.next;
            ListNode next2 = t2.next;
            t1.next = t2;
            t2.next = next1;
            t1 = next1;
            t2 = next2;
        }
        return;
    }
}
