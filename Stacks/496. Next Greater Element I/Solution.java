class Solution {
    public int[] nextGreaterElement(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            int j = m - 1;
            while (j >= 0 && arr1[i] != arr2[j]) {
                st.push(arr2[j]);
                j--;
            }
            while (st.size() > 0 && arr1[i] >= st.peek()) {
                st.pop();
            }
            if (st.size() == 0) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
        }
        return ans;
    }
}
