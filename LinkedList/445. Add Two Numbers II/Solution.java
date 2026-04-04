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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1.val == 0 && l2.val == 0)
            return new ListNode(0);
        ListNode list1 = reverse(l1);
        ListNode list2 = reverse(l2);
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int carry = 0;
        while (list1 != null || list2 != null) {
            int value1 = list1 != null ? list1.val : 0;
            int value2 = list2 != null ? list2.val : 0;
            int sum = value1 + value2 + carry;
            int n = sum % 10;
            temp.next = new ListNode(n);
            temp = temp.next;
            carry = sum / 10;
            if (list1 != null)
                list1 = list1.next;
            if (list2 != null)
                list2 = list2.next;
        }
        if (carry != 0) {
            temp.next = new ListNode(carry);
            temp = temp.next;
        }
        return reverse(dummy.next);
    }

    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode fwd = null;
        while (curr != null) {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
}