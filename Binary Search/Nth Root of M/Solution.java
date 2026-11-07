class Solution {
    public int nthRoot(int n, int m) {
        // code here
        int start = 0;
        int end = m;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            long power = 1;
            for (int i = 1; i <= n; i++) {
                power *= mid;

                if (power > m) {
                    break;
                }
            }
            if (power == m) {
                return mid;
            } else if (power > m) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
