class Solution {
    int[] dp;

    public int climbStairs(int n) {
        dp = new int[n + 1];
        if (n <= 2)
            return n;
        return steps(n);
    }

    public int steps(int n) {
        if (n <= 2)
            return n;
        if (dp[n] != 0)
            return dp[n];
        return dp[n] = steps(n - 1) + steps(n - 2);
    }
}

// recursive approch
// public int climbStairs(int n) {
// if(n <= 2) return n;
// return climbStairs(n - 1) + climbStairs(n - 2);
// }