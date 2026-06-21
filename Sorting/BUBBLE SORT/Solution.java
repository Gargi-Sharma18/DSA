class Solution {
    public void bubbleSort(int[] arr) {
        // code here
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            boolean flag = false;

            for (int j = 1; j < n - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
    }
}
