class Solution {
    static int[][] dp;

    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}

// memoization
// static int[][] dp;
// public int uniquePaths(int m, int n) {
// dp = new int[m+1][n+1];
// return path(m , n);
// }
// public int path(int m , int n){
// if(m == 1 || n == 1){
// return 1;
// }
// if(dp[m][n] != 0) return dp[m][n];
// return dp[m][n] = uniquePaths(m - 1, n) + uniquePaths(m , n - 1);
// }