class Solution {
    public int maxValue(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return arr[0];
        if (n == 2)
            return Math.max(arr[0], arr[1]);

        int[] dp1 = new int[n - 1];
        int[] dp2 = new int[n - 1];
        return Math.max(loot(0, n - 1, arr, dp1), loot(1, n, arr, dp2));
    }

    public static int loot(int idx, int n, int[] arr, int[] dp) {
        dp[0] = arr[idx];
        dp[1] = Math.max(arr[idx], arr[idx + 1]);

        for (int i = 2; i < n - idx; i++) {
            dp[i] = Math.max(arr[i + idx] + dp[i - 2], dp[i - 1]);
        }
        return dp[n - 1 - idx];
    }
}