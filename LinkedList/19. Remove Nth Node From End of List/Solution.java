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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode findSize = head;
        int len = 0;
        while (findSize != null) {
            findSize = findSize.next;
            len++;
        }
        if (n > len) {
            return head;
        }
        int size = len - n;
        if (size == 0) {
            head = head.next;
        } else {
            ListNode temp = head;
            for (int i = 0; i < size - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        return head;
    }
}
