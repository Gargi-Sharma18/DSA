class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];

        int k = 0;
        while (k < m) {
            if (obstacleGrid[k][0] == 1)
                k = m;
            else {
                dp[k][0] = 1;
                k++;
            }
        }
        k = 0;
        while (k < n) {
            if (obstacleGrid[0][k] == 1)
                k = n;
            else {
                dp[0][k] = 1;
                k++;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1)
                    dp[i][j] = 0;
                else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
