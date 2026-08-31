class Solution {
    public int climbStairs(int n) { // most optimal approch
        if (n <= 1)
            return n;
        int[] dp = new int[3];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[2] = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        return dp[2];
    }
}

// memoixation approch
// int[] dp;
// public int climbStairs(int n) {
// dp = new int[n+1];
// if(n <= 2) return n;
// return steps(n);
// }
// public int steps(int n){
// if(n <= 2) return n;
// if(dp[n] != 0) return dp[n];
// return dp[n] = steps(n - 1) + steps(n - 2);
// }
// }

// recursive approch
// public int climbStairs(int n) {
// if(n <= 2) return n;
// return climbStairs(n - 1) + climbStairs(n - 2);
// }