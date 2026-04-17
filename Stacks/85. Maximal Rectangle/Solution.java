class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[][] arr = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                arr[i][j] = matrix[i][j] - '0';
            }
        }
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    arr[i][j] += arr[i - 1][j];
                }
            }
        }
        int max = 0;
        for (int[] row : arr) {
            int area = largestRectangleArea(row);
            max = Math.max(area, max);
        }
        return max;
    }

    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        nse[n - 1] = n;

        Stack<Integer> st = new Stack<>();
        st.push(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.size() == 0)
                nse[i] = n;
            else
                nse[i] = st.peek();
            st.push(i);
        }
        while (st.size() > 0) {
            st.pop();
        }

        int[] pse = new int[n];
        pse[0] = -1;
        st.push(0);
        for (int i = 1; i < n; i++) {
            while (st.size() > 0 && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.size() == 0)
                pse[i] = -1;
            else
                pse[i] = st.peek();
            st.push(i);
        }
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int area = arr[i] * (nse[i] - pse[i] - 1);
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
}
