class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        int leftMax = 0;
        int rightMax = 0;
        int total = 0;
        while (i < j) {
            if (arr[i] <= arr[j]) {
                if (arr[i] >= leftMax) {
                    leftMax = arr[i];
                } else {
                    total += leftMax - arr[i];
                }
                i++;
            } else {
                if (arr[j] >= rightMax) {
                    rightMax = arr[j];
                } else {
                    total += rightMax - arr[j];
                }
                j--;
            }
        }
        return total;
    }
}
// int[] preffixMax = new int[n];
// int[] suffixMax = new int[n];

// int max = 0;
// for(int i = 0;i < n;i++){
// max = Math.max(arr[i],max);
// preffixMax[i] = max;
// }
// max = 0;
// for(int i = n-1;i >= 0;i--){
// max = Math.max(arr[i],max);
// suffixMax[i] = max;
// }

// int total = 0;
// for(int i = 0;i < n;i++){
// total += (Math.min(preffixMax[i],suffixMax[i]) - arr[i]);
// }
// return total;
