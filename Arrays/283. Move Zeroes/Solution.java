import java.util.*;

class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1)
            return;
        int i = 0;
        int j = 1;
        while (j < n) {
            if (j < n && arr[i] == 0 && arr[j] == 0) {
                j++;
            }
            if (j < n && arr[j] == 0 && arr[i] != 0) {
                i++;
                j++;
            }
            if (j < n && arr[i] != 0 && arr[j] != 0) {
                i++;
                j++;
            }
            if (j < n && arr[i] == 0 && arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
    }
}
