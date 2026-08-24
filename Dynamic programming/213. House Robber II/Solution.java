class Solution {
    int[] dp1;
    int[] dp2;

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        dp1 = new int[n];
        dp2 = new int[n];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        int case1 = loot(0, n - 1, nums, dp1);
        int case2 = loot(1, n, nums, dp2);
        return Math.max(case1, case2);
    }

    public int loot(int idx, int n, int[] arr, int[] dp) {
        if (idx >= n)
            return 0;
        if (dp[idx] != -1)
            return dp[idx];
        int pick = arr[idx] + loot(idx + 2, n, arr, dp);
        int skip = loot(idx + 1, n, arr, dp);
        return dp[idx] = Math.max(pick, skip);
    }
}