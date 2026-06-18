class Solution {
    public int maxScore(int[] arr, int k) {
        int n = arr.length;
        int Lsum = 0;
        for (int i = 0; i < k; i++) {
            Lsum += arr[i];
        }
        int i = k - 1;
        int j = n - 1;
        int Rsum = 0;
        int sum = Lsum + Rsum;

        while (i >= 0) {
            Lsum -= arr[i];
            Rsum += arr[j];
            sum = Math.max(sum, Lsum + Rsum);
            i--;
            j--;
        }
        return sum;
    }
}