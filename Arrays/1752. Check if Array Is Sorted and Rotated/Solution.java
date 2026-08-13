class Solution {
    public boolean check(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        int n = arr.length;

        boolean flag = true;
        for (int k = 0; k < n; k++) {
            if (arr[k] != sorted[k]) {
                flag = false;
            }
        }
        if (flag == true)
            return true;

        int min = sorted[0];
        for (int i = 0; i < n; i++) {

            if (arr[i] != min)
                continue;
            int[] temp = arr.clone();
            reverse(temp, 0, i - 1);
            reverse(temp, i, n - 1);
            reverse(temp, 0, n - 1);
            if (Arrays.equals(temp, sorted)) {
                return true;
            }
        }
        return false;
    }

    private void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
