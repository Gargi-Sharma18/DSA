class Solution {
    int[] dp;

    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        Arrays.fill(dp, -1);
        return Math.min(minCost(0, cost), minCost(1, cost));
    }

    public int minCost(int index, int[] cost) {
        if (index >= cost.length)
            return 0;
        if (dp[index] != -1)
            return dp[index];
        return dp[index] = cost[index] + Math.min(minCost(index + 1, cost), minCost(index + 2, cost));
    }
}

// public int minCostClimbingStairs(int[] cost) {
// return Math.min(minCost(0 , cost) , minCost(1 , cost));
// }

// public int minCost(int index , int[] cost){
// if(index >= cost.length) return 0;
// return cost[index] + Math.min(minCost(index + 1 , cost) , minCost(index + 2 ,
// cost));
// }