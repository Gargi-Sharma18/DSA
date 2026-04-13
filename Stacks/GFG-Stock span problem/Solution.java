class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] >= arr[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = i + 1;
            } else {
                ans[i] = i - st.peek();
            }
            st.push(i);
        }
        ArrayList<Integer> span = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            span.add(ans[i]);
        }
        return span;
    }
}