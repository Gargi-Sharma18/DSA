
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list1 = l1;
        ListNode list2 = l2;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int carry = 0;
        while (list1 != null || list2 != null) {
            int val1 = (list1 != null) ? list1.val : 0;
            int val2 = (list2 != null) ? list2.val : 0;
            int sum = val1 + val2 + carry;
            int n = sum % 10;
            temp.next = new ListNode(n);
            temp = temp.next;
            if ((sum / 10) != 0) {
                carry = sum / 10;
            } else {
                carry = 0;
            }
            if (list1 != null)
                list1 = list1.next;
            if (list2 != null)
                list2 = list2.next;
        }
        if (carry != 0) {
            temp.next = new ListNode(carry);
            temp = temp.next;
        }
        return dummy.next;
    }
}
