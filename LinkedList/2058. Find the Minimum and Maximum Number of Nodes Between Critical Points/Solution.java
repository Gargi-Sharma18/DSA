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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] arr = new int[2];
        if (head == null || head.next == null || head.next.next == null)
            return new int[] { -1, -1 };

        ListNode prev = head;
        ListNode curr = head.next;
        ListNode fwd = curr.next;
        int idx = 2;
        int first = -1;
        int last = -1;
        int minDist = Integer.MAX_VALUE;
        while (fwd != null) {
            if ((prev.val > curr.val && curr.val < fwd.val) || (prev.val < curr.val && curr.val > fwd.val)) {
                if (first == -1)
                    first = idx;
                if (last != -1) {
                    int dist = idx - last;
                    minDist = Math.min(minDist, dist);
                }
                last = idx;
            }
            prev = curr;
            curr = fwd;
            idx++;
            fwd = curr.next;
        }
        int maxDist = last - first;
        if (maxDist == 0)
            maxDist = -1;
        if (minDist == Integer.MAX_VALUE)
            minDist = -1;
        return new int[] { minDist, maxDist };
    }
}
