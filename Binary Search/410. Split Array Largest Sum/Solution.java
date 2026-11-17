class Solution {
    public int splitArray(int[] arr, int k) {
        int start = maximum(arr);
        int end = maxSum(arr);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int split = splitCount(arr, mid);
            if (split > k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    static int splitCount(int[] arr, int mid) {
        int count = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((sum + arr[i]) <= mid) {
                sum += arr[i];
            } else {
                count++;
                sum = arr[i];
            }
        }
        return count;
    }

    static int maxSum(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max += arr[i];
        }
        return max;
    }

    static int maximum(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        return max;
    }
}
