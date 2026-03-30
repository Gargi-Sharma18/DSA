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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 1; i <= k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode fromStart = head;
        for (int i = 1; i < k; i++) {
            fromStart = fromStart.next;
        }
        int temp = fromStart.val;
        fromStart.val = slow.val;
        slow.val = temp;
        return head;

        // ListNode findSize = head;
        // int n = 0;

        // while(findSize != null){
        // findSize = findSize.next;
        // n++;
        // }
        // ListNode temp1 = head;
        // for(int i = 1;i < k;i++){
        // temp1 = temp1.next;
        // }
        // ListNode temp2 = head;
        // for(int i = 1;i <= n-k;i++){
        // temp2 = temp2.next;
        // }
        // int temp = temp1.val;
        // temp1.val = temp2.val;
        // temp2.val = temp;
        // return head;
    }
}
