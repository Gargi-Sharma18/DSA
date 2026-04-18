class Solution {
    public static void queueTraversal(Queue<Integer> q) {

        int n = q.size();
        for (int i = 0; i < n; i++) {
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }

    }
}