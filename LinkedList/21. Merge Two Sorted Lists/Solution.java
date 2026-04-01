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
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode i = head1;
        ListNode j = head2;
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        while (i != null && j != null) {
            if (i.val <= j.val) {
                t.next = i;
                t = i;
                i = i.next;
            } else { // i.val > j.val
                t.next = j;
                t = j;
                j = j.next;
            }
        }
        while (i != null) {
            t.next = i;
            t = i;
            i = i.next;
        }
        while (j != null) {
            t.next = j;
            t = j;
            j = j.next;
        }
        t.next = null;
        return dummy.next;
    }
}