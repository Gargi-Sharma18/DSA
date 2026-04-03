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
    public ListNode mergeKLists(ListNode[] list) {
        if (list.length == 0)
            return null;
        List<ListNode> arr = new ArrayList<>(Arrays.asList(list));
        while (arr.size() > 1) {
            ListNode a = arr.get(arr.size() - 1);
            arr.remove(arr.size() - 1);
            ListNode b = arr.get(arr.size() - 1);
            arr.remove(arr.size() - 1);
            ListNode c = merge(a, b);
            arr.add(c);
        }
        return arr.get(0);
    }

    public ListNode merge(ListNode head1, ListNode head2) {
        ListNode i = head1;
        ListNode j = head2;
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        while (i != null && j != null) {
            if (i.val <= j.val) {
                t.next = i;
                t = i;
                i = i.next;
            } else {
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
        return dummy.next;
    }
}
