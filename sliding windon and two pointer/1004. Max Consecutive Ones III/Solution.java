class Solution {
    public int longestOnes(int[] arr, int k) {
        int i = 0;
        int zero = 0;
        int maxLen = 0;

        for (int j = 0; j < arr.length; j++) {

            if (arr[j] == 0) {
                zero++;
            }
            while (zero > k) {
                if (arr[i] == 0) {
                    zero--;
                }
                i++;
            }
            int len = j - i + 1;
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
}
