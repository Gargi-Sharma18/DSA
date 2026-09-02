class Solution {
    public int countFriendsPairings(int n) {
        int[] dp = new int[n + 1];
        return friend(n, dp);
    }

    public static int friend(int n, int[] dp) {

        if (n <= 2)
            return n;
        if (dp[n] != 0)
            return dp[n];
        return dp[n] = friend(n - 1, dp) + (n - 1) * friend(n - 2, dp);
    }
}