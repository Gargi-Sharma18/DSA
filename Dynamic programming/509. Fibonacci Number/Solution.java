class Solution {

    static int[] dp;

    public static int fib(int n) {
        dp = new int[n + 1];
        return fibo(n);
    }

    public static int fibo(int n) {
        if (n <= 1)
            return n;
        if (dp[n] != 0) {
            return dp[n];
        }
        int ans = fibo(n - 1) + fibo(n - 2);
        dp[n] = ans;
        return ans;
    }
}

// if(n == 0 || n == 1){
// return n;
// }
// return fib(n - 2) + fib(n - 1);
// }

// int a = 0,b = 1;
// for(int i = 0;i < n;i++){
// int sum = a + b;
// a = b;
// b = sum;
// }
// return a;
