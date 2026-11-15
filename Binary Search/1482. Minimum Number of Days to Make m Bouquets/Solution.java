class Solution {
    public int minDaysBloom(int[] arr, int k, int m) {
        // code here
        int start = minDays(arr);
        int end = maxDays(arr);
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            boolean bouq = bouquets(arr, k, m, mid);

            if (bouq) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static boolean bouquets(int[] arr, int k, int m, int mid) {

        int flower = 0;
        int bouq = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= mid) {
                flower++;

                if (flower == k) {
                    bouq++;
                    flower = 0;
                }
            } else {
                flower = 0;
            }
        }
        return (bouq >= m);
    }

    public static int minDays(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }
        return min;
    }

    public static int maxDays(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        return max;
    }
}