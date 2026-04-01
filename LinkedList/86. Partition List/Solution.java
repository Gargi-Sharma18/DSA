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
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null)
            return head;
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode t1 = dummy1;
        ListNode t2 = dummy2;
        ListNode i = head;
        while (i != null) {
            if (i.val < x) {
                t1.next = i;
                t1 = i;
            } else {
                t2.next = i;
                t2 = i;
            }
            i = i.next;
        }
        t1.next = dummy2.next;
        t2.next = null;
        return dummy1.next;
    }

}