class Solution {
    public int coinChange(int[] coins, int sum) {
        int ans = helper(0, sum, coins);
        return (ans != Integer.MAX_VALUE) ? ans : -1;
    }

    private int helper(int i, int sum, int[] coins) {
        if (i == coins.length) {
            if (sum == 0)
                return 0;
            else
                return Integer.MAX_VALUE;
        }
        int skip = helper(i + 1, sum, coins);
        if (sum < coins[i])
            return skip;
        int take = helper(i, sum - coins[i], coins);
        int pick = (take == Integer.MAX_VALUE) ? take : take + 1;
        return Math.min(skip, pick);
    }
}