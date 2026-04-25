class LinkedListStack {
    Node head;
    Node tail;
    int size;
    public LinkedListStack() {
        head = null;
        tail = null;
        size = 0;
    }

    public void push(int x) {
        Node temp = new Node(x);
        if(head == null){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public int pop() {
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        int popVal = temp.next.val;
        temp.next = null;
        size--;
        return popVal;
        
    }

    public int top() {
        Node temp = head;
        int popVal = tail.val;
        while(temp.next != null){
            temp = temp.next;
        }
        return temp.val;
    }

    public boolean isEmpty() {
        if(size == 0) return true;
        return false;
    }
}
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
