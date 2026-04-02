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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode curr = slow;
        ListNode prev = null;
        ListNode fwd = null;
        while (curr != null) {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        int maxSum = 0;
        ListNode i = head;
        ListNode j = prev;
        while (j != null) {
            maxSum = Math.max((i.val + j.val), maxSum);
            i = i.next;
            j = j.next;
        }
        return maxSum;
    }
}
