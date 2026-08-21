class Solution {

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if (n == 1)
            return Math.min(cost[0], cost[1]);
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }
        return Math.min(dp[n - 1], dp[n - 2]);
    }
}

// memoization
// int[] dp;
// public int minCostClimbingStairs(int[] cost) {
// dp = new int[cost.length];
// Arrays.fill(dp , -1);
// return Math.min(minCost(0 , cost) , minCost(1 , cost));
// }
// public int minCost(int index , int[] cost){
// if(index >= cost.length) return 0;
// if(dp[index] != -1) return dp[index];
// return dp[index] = cost[index] + Math.min(minCost(index + 1 , cost) ,
// minCost(index + 2 , cost));
// }

// recursive approch
// public int minCostClimbingStairs(int[] cost) {
// return Math.min(minCost(0 , cost) , minCost(1 , cost));
// }

// public int minCost(int index , int[] cost){
// if(index >= cost.length) return 0;
// return cost[index] + Math.min(minCost(index + 1 , cost) , minCost(index + 2 ,
// cost));
// }