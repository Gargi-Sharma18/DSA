class Solution {
    int floorSqrt(int n) {
        // code here
        int start = 0;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
}