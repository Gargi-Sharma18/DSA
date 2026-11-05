class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int ans = helper(0, amount, coins, dp);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private int helper(int i, int sum, int[] coins, int[][] dp) {
        if (i == coins.length) {
            if (sum == 0)
                return 0;
            return Integer.MAX_VALUE;
        }
        if (dp[i][sum] != -1) {
            return dp[i][sum];
        }
        int skip = helper(i + 1, sum, coins, dp);
        int pick = Integer.MAX_VALUE;
        if (sum >= coins[i]) {
            int take = helper(i, sum - coins[i], coins, dp);
            if (take != Integer.MAX_VALUE) {
                pick = take + 1;
            }
        }
        return dp[i][sum] = Math.min(skip, pick);
    }
}

// public int coinChange(int[] coins, int sum) {
// int ans = helper(0 ,sum ,coins);
// return (ans != Integer.MAX_VALUE) ? ans:-1;
// }
// private int helper(int i ,int sum ,int[] coins){
// if(i == coins.length){
// if(sum == 0) return 0;
// else return Integer.MAX_VALUE;
// }
// int skip = helper(i+1 ,sum ,coins);
// if(sum < coins[i]) return skip;
// int take = helper(i ,sum-coins[i] ,coins);
// int pick = (take == Integer.MAX_VALUE) ? take : take+1;
// return Math.min(skip ,pick);
// }