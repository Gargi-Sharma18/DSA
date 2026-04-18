class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        int n = q.size();
        if (k > n)
            return q;
        Stack<Integer> st = new Stack<>();

        for (int i = 1; i <= k; i++) {
            st.push(q.remove());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
        if (k < n) {
            for (int i = 1; i <= n - k; i++) {
                q.add(q.remove());
            }
        }
        return q;
    }
}