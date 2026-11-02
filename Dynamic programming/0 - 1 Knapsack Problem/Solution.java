class Solution {
    public int knapsack(int cap, int val[], int wt[]) {
        // code here
        return maxVal(0, cap, val, wt);
    }

    public static int maxVal(int i, int cap, int[] val, int[] wt) {
        if (i == val.length) {
            if (cap >= 0)
                return 0;
            else
                return Integer.MIN_VALUE;
        }
        int pick = val[i] + maxVal(i + 1, cap - wt[i], val, wt);
        int skip = maxVal(i + 1, cap, val, wt);
        return Math.max(pick, skip);
    }
}
