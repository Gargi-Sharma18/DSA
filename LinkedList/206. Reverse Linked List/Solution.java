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
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode forward = null;
        while (curr != null) {
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;

        // reverse approch
        // if(head == null && head.next == null) return head;
        // ListNode a = head.next;
        // head.next = null;
        // Node b = reverse(a);
        // a.next = head;
        // return b;

        // arrayList approch
        // if(head == null) return head;
        // ListNode temp = head;
        // ArrayList<ListNode> arr = new ArrayList<>();
        // while(temp != null){
        // arr.add(temp);
        // temp = temp.next;
        // }
        // int n = arr.size();
        // for(int i = n-1;i >= 1;i--){
        // arr.get(i).next = arr.get(i-1);
        // }
        // arr.get(0).next = null;
        // return arr.get(n-1);
    }
}