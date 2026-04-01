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
    public ListNode oddEvenList(ListNode head) {
        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-1);
        ListNode t1 = d1;
        ListNode t2 = d2;
        ListNode i = head;
        int n = 1;
        while (i != null) {
            if ((n % 2) != 0) {
                t1.next = i;
                t1 = i;
            } else {
                t2.next = i;
                t2 = i;
            }
            i = i.next;
            n++;
        }
        t1.next = d2.next;
        t2.next = null;
        return d1.next;
    }
}
