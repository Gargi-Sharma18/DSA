/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        Node curr = head;
        Node previous = null;
        Node fwd = null;
        while (curr != null) {
            fwd = curr.next;
            curr.next = previous;
            curr.prev = fwd;
            previous = curr;
            curr = fwd;
        }
        return previous;
    }
}
