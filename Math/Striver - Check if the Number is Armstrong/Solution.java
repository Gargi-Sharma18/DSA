class Solution {
    public boolean isArmstrong(int x) {
        int n = x;
        int sum = 0;

        while (n != 0) {
            int rem = n % 10;
            int cube = (int) Math.pow(rem, 3);
            sum = sum + cube;
            n /= 10;
        }
        if (sum == x)
            return true;
        return false;
    }
}
