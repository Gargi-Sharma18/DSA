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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        ListNode len = head;
        int n = 0;
        int rotation = k;
        if (head == null)
            return null;
        while (len != null) {
            len = len.next;
            n++;
        }
        if (k >= n) {
            rotation = k % n;
        }
        for (int i = 1; i < (n - rotation); i++) {
            temp = temp.next;
        }
        if (temp.next != null) {
            ListNode rotate = temp.next;
            ListNode tail = rotate;
            temp.next = null;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = head;
            return rotate;
        }
        return head;
    }
}