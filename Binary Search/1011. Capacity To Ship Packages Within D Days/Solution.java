class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int start = maximum(arr);
        int end = sumAll(arr);
        int ans = start;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            boolean capDays = capacityIndays(arr, days, mid);
            if (capDays) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static boolean capacityIndays(int[] arr, int days, int mid) {
        int sum = 0;
        int day = 1;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] > mid) {
                day++;
                sum = arr[i];
            } else {
                sum += arr[i];
            }
        }
        return (day <= days);
    }

    public static int sumAll(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int maximum(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        return max;
    }
}