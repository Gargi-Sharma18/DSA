class Solution {
    public int numSubarraysWithSum(int[] arr, int goal) {
        int subArrayLessOrEqual = lessOrEqualToGoal(arr, goal);
        int subArrayLess = lessThanGoal(arr, goal);
        return (subArrayLessOrEqual - subArrayLess);
    }

    public int lessOrEqualToGoal(int[] arr, int goal) {
        int n = arr.length;
        int i = 0;
        int sum = 0;
        int subArray = 0;

        for (int j = 0; j < n; j++) {
            sum += arr[j];

            while (sum > goal) {
                sum -= arr[i];
                i++;
            }
            if (sum <= goal) {
                subArray += j - i + 1;
            }
        }
        return subArray;
    }

    public int lessThanGoal(int[] arr, int goal) {
        int n = arr.length;
        int i = 0;
        int sum = 0;
        int subArray = 0;

        for (int j = 0; j < n; j++) {
            sum += arr[j];

            while (i <= j && sum >= goal) {
                sum -= arr[i];
                i++;
            }
            if (sum < goal) {
                subArray += j - i + 1;
            }
        }
        return subArray;
    }
}