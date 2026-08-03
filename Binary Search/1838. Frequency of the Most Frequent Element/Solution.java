class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        long[] prefix = new long[n];
        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        int ans = 1;

        for (int i = 0; i < n; i++) {

            int low = 0;
            int high = i;

            while (low < high) {

                int mid = low + (high - low) / 2;

                long sum = prefix[i] - (mid > 0 ? prefix[mid - 1] : 0);
                long need = (long) nums[i] * (i - mid + 1) - sum;
                if (need <= k) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
            ans = Math.max(ans, i - low + 1);
        }
        return ans;
    }
}
// Arrays.sort(nums);

// int ans = 1;

// for (int i = 0; i < nums.length; i++) {
// int target = nums[i];
// long cost = 0;
// int freq = 1;

// // Try to make previous elements equal to target
// for (int j = i - 1; j >= 0; j--) {
// cost += (target - nums[j]);

// if (cost <= k) {
// freq++;
// } else {
// break;
// }
// }

// ans = Math.max(ans, freq);
// }

// return ans;
// }
// }