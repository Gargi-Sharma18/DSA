class Solution {
    public int[] rearrangeArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        int pos = 0;
        int neg = 1;

        for (int x : arr) {

            if (x >= 0) {
                ans[pos] = x;
                pos += 2;
            } else {
                ans[neg] = x;
                neg += 2;
            }
        }
        return ans;
    }
}
