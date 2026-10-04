class Solution {
    public int countSquares(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int total = 0;
        int[][] ans = new int[m][n];

        for (int j = 0; j < n; j++) {
            ans[0][j] = arr[0][j];
            total += arr[0][j];
        }
        for (int i = 1; i < m; i++) {
            ans[i][0] = arr[i][0];
            total += arr[i][0];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] != 0) {
                    ans[i][j] = arr[i][j] + Math.min(ans[i - 1][j - 1], Math.min(ans[i - 1][j], ans[i][j - 1]));
                }
                total += ans[i][j];
            }
        }
        return total;
    }
}