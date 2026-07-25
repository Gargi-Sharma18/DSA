
class Solution {
    public int countGoodNumbers(long n) {

        long evenPosition = (n + 1) / 2;
        long oddPosition = n / 2;
        long mod = 1000000007;

        long even = calculate(5, evenPosition);
        long odd = calculate(4, oddPosition);

        return (int) ((even * odd) % mod);
    }

    public long calculate(long base, long power) {
        long mod = 1000000007;

        long ans = 1;
        while (power > 0) {
            if (power % 2 == 1) {
                ans = (ans * base) % mod;
            }
            base = (base * base) % mod;
            power = power / 2;
        }
        return ans;
    }
}
