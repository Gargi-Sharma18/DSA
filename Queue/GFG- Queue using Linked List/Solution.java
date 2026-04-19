class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {

    Node head;
    Node tail;

    public myQueue() {
        // Initialize your data members
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        // check if the queue is empty
        if (head == null) {
            return true;
        }
        return false;
    }

    public void enqueue(int x) {
        // Adds an element x at the rear of the queue.
        Node temp = new Node(x);

        if (head == null)
            head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
    }

    public void dequeue() {
        // Removes the front element of the queue
        head = head.next;
    }

    public int getFront() {
        // Returns the front element of the queue.
        // If queue is empty, return -1.
        if (head == null)
            return -1;
        Node t = head;
        return t.data;

    }

    public int size() {
        // Returns the current size of the queue.
        Node t = head;
        int n = 0;
        while (t != null) {
            t = t.next;
            n++;
        }
        return n;
    }
}
