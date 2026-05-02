class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        ans[0] = -1;
        st.push(arr[0]);
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {// st.peek() < arr[i]
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(ans[i]);
        }
        return result;
    }
}
