import java.util.*;

class Solution {
    public int maxSubArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum < 0) {
                sum = 0;
            }
            sum += arr[i];
            max = Math.max(sum, max);
        }
        return max;
    }
}