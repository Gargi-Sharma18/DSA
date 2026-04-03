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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;

        for (int i = 1; i <= left - 1; i++) {
            temp = temp.next;
        }
        ListNode tail1 = temp;
        ListNode head2 = tail1.next;
        for (int i = 1; i <= right - left + 1; i++) {
            temp = temp.next;
        }

        ListNode tail2 = temp;
        ListNode head3 = tail2.next;

        tail2.next = null;

        reverse(head2);
        tail1.next = tail2;
        head2.next = head3;

        return dummy.next;
    }

    public void reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode fwd = null;

        while (curr != null) {
            fwd = curr.next; // ✅ fix
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
    }
}
