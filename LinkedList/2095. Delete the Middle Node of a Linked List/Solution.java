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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;

        return head;

        // ListNode findSize = head;
        // int size = 0;
        // while(findSize != null){
        // findSize = findSize.next;
        // size++;
        // }
        // int mid = size / 2;
        // ListNode temp = head;
        // for(int i = 0;i < mid-1;i++){
        // temp = temp.next;
        // }
        // if(mid == 0){ //when one element is there
        // head = head.next;
        // }
        // else if(mid == size-1){//there is only too element
        // head.next = null;
        // }
        // else{
        // temp.next = temp.next.next;
        // }
        // return head;
    }
}