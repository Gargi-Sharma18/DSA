class Solution {
    public Node flatten(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mergeHead = flatten(head.next);
        return merge(head, mergeHead);
    }

    public static Node merge(Node list1, Node list2) {
        Node dummy = new Node(-1);
        Node t = dummy;

        while (list1 != null && list2 != null) {

            if (list1.data < list2.data) {
                t.bottom = list1;
                t = list1;
                list1 = list1.bottom;
            } else { // list2.data < list1.data
                t.bottom = list2;
                t = list2;
                list2 = list2.bottom;
            }
        }
        if (list1 != null) {
            t.bottom = list1;
        } else { // list2 != null
            t.bottom = list2;
        }
        if (dummy.bottom != null) {
            dummy.bottom.next = null;
        }
        return dummy.bottom;
    }
}
// if(head == null) return head;
// ArrayList<Integer> arr = new ArrayList<>();

// Node temp = head;
// while(temp != null){
// Node t = temp;
// while(t != null){
// arr.add(t.data);
// t = t.bottom;
// }
// temp = temp.next;
// }

// Collections.sort(arr);

// Node dummy = new Node(-1);
// temp = dummy;

// for(int n : arr){
// Node t = new Node(n);
// temp.bottom = t;
// temp = t;
// }

// return dummy.bottom;
// }
// }
