class Solution {
    public int derangeCount(int n) {
        // code here
        int[] dp = new int[n + 1];
        return dearrange(n, dp);
    }

    public static int dearrange(int n, int[] dp) {
        if (n <= 1)
            return 0;
        if (n == 2)
            return 1;
        if (dp[n] != 0)
            return dp[n];
        return dp[n] = (n - 1) * (dearrange(n - 1, dp) + dearrange(n - 2, dp));
    }
}