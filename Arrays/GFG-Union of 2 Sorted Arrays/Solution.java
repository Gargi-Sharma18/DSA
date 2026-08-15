import java.util.*;

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        int m = a.length;
        int n = b.length;
        ArrayList<Integer> arr = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (a[i] < b[j]) {
                arr.add(a[i]);
                i++;
                while (i < m && a[i] == a[i - 1])
                    i++;
            } else if (b[j] < a[i]) {
                arr.add(b[j]);
                j++;
                while (j < n && b[j] == b[j - 1])
                    j++;
            } else {
                arr.add(a[i]);
                i++;
                while (i < m && a[i] == a[i - 1])
                    i++;
                j++;
                while (j < n && b[j] == b[j - 1])
                    j++;
            }
        }
        while (j < n) {
            arr.add(b[j]);
            j++;
            while (j < n && b[j] == b[j - 1])
                j++;
        }
        while (i < m) {
            arr.add(a[i]);
            i++;
            while (i < m && a[i] == a[i - 1])
                i++;
        }
        return arr;
    }
}
