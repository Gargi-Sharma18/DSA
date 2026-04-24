class LinkedListQueue {
    Node head;
    Node tail;
    int size;

    public LinkedListQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    public void push(int x) {
        Node temp = new Node(x);
        if (head == null)
            head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public int pop() {
        if (head == null)
            return -1;
        int popVal = head.val;
        head = head.next;
        size--;
        return popVal;
    }

    public int peek() {
        if (head == null)
            return -1;
        return head.val;
    }

    public boolean isEmpty() {
        if (size == 0)
            return true;
        return false;
    }
}

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}
