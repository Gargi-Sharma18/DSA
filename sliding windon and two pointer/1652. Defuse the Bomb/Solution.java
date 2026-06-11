class Solution {
    public int[] decrypt(int[] arr, int k) {
        int n = arr.length;
        int[] ans = new int[n];
        if (k == 0) {
            for (int i = 0; i < arr.length; i++) {
                ans[i] = 0;
            }
        } else if (k > 0) {
            int sum = 0;
            for (int i = 0; i <= k; i++) {
                sum += arr[i];
            }
            sum = sum - arr[0];
            ans[0] = sum;

            int j = 0;
            for (int i = 1; i < arr.length; i++) {
                j = i + k;
                if (j >= n) {
                    j = j - n;
                }
                sum += arr[j];
                sum = sum - arr[i];
                ans[i] = sum;
            }
        } else {
            int sum = 0;
            for (int i = n - 1; i >= n + k - 1; i--) {
                sum += arr[i];
            }
            sum = sum - arr[n - 1];
            ans[n - 1] = sum;

            int j = 0;
            for (int i = n - 2; i >= 0; i--) {
                j = i + k;
                if (j < 0) {
                    j = n + j;
                }
                sum += arr[j];
                sum = sum - arr[i];
                ans[i] = sum;
            }
        }
        return ans;
    }
}