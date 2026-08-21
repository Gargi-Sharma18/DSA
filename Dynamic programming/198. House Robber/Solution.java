class Solution {
    public int rob(int[] arr) {

        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = arr[0];
        if (n > 1) {
            dp[1] = Math.max(arr[0], arr[1]);
        }
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(arr[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[n - 1];
    }
}

// memoication approch
// int[] dp;
// public int rob(int[] nums) {
// dp = new int[nums.length];
// Arrays.fill(dp , -1);
// return loot(0 , nums);
// }
// public int loot(int idx , int[] arr){

// if(idx >= arr.length) return 0;
// if(dp[idx] != -1){
// return dp[idx];
// }
// int pick = arr[idx] + loot(idx + 2 , arr);
// int skip = loot(idx + 1 , arr);
// return dp[idx] = Math.max(pick , skip);

// }

// recuresive approch
// public int rob(int[] nums) {
// return loot(0 , nums);
// }
// public int loot(int idx , int[] arr){
// if(idx >= arr.length) return 0;
// int pick = arr[idx] + loot(idx + 2 , arr);
// int skip = loot(idx + 1 , arr);
// int ans = Math.max(pick , skip);
// return ans;
// }
