class LFUCache {
    int cap;
    int minFreq;
    int curSize;
    HashMap<Integer, Node> mapNode;
    HashMap<Integer, DLL> mapFreqList;

    public LFUCache(int capacity) {
        cap = capacity;
        minFreq = 0;
        curSize = 0;
        mapNode = new HashMap<>();
        mapFreqList = new HashMap<>();
    }

    public void updateFreqList(Node node) {
        mapNode.remove(node.key);
        mapFreqList.get(node.count).deleteNode(node);
        if (node.count == minFreq && mapFreqList.get(node.count).size == 0) {
            minFreq++;
        }
        DLL higherFreqList = new DLL();
        if (mapFreqList.containsKey(node.count + 1)) {
            higherFreqList = mapFreqList.get(node.count + 1);
        }
        node.count += 1;
        higherFreqList.addFront(node);
        mapFreqList.put(node.count, higherFreqList);
        mapNode.put(node.key, node);
    }

    public int get(int key) {
        if (mapNode.containsKey(key)) {
            Node node = mapNode.get(key);
            int val = node.value;
            mapNode.remove(node);
            updateFreqList(node);
            return val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (cap == 0) {
            return;
        }
        if (mapNode.containsKey(key)) {
            Node node = mapNode.get(key);
            node.value = value;
            updateFreqList(node);
        } else {
            if (curSize == cap) {
                DLL list = mapFreqList.get(minFreq);
                mapNode.remove(list.tail.prev.key);
                mapFreqList.get(minFreq).deleteNode(list.tail.prev);
                curSize--;
            }
            curSize++;
            minFreq = 1;
            DLL freqList = new DLL();// dummy list
            if (mapFreqList.containsKey(minFreq)) {
                freqList = mapFreqList.get(minFreq);
            }
            Node node = new Node(key, value);
            freqList.addFront(node);
            mapNode.put(key, node);
            mapFreqList.put(minFreq, freqList);
        }
    }
}

class Node {
    int key;
    int value;
    int count;
    Node next;
    Node prev;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
        count = 1;
    }
}

class DLL {
    int size; // Size
    Node head; // Dummy head
    Node tail; // Dummy tail

    // Constructor
    DLL() {
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    void addFront(Node node) {
        Node temp = head.next;
        node.next = temp;
        node.prev = head;
        head.next = node;
        temp.prev = node;
        size++;
    }

    void deleteNode(Node delnode) {
        Node prevNode = delnode.prev;
        Node nextNode = delnode.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        size--;
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
