class Solution {
    public int smallestDivisor(int[] arr, int threshold) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int start = 1;
        int end = max;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (sumOfDivision(arr, mid, threshold)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;

    }

    static boolean sumOfDivision(int[] arr, int divisor, int threshold) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += (int) Math.ceil((double) arr[i] / divisor);
        }
        if (result <= threshold) {
            return true;
        }
        return false;
    }
}