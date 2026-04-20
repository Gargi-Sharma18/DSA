class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        int n = q.size();
        Queue<Integer> q2 = new ArrayDeque<>();
        for (int i = 0; i < n / 2; i++) {
            q2.add(q.remove());
        }
        while (q2.size() != 0) {
            q.add(q2.remove());
            q.add(q.remove());
        }
    }
}
