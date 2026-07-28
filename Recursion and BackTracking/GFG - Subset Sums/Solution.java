import java.util.*;

class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();
        subset(0, arr, 0, ans);
        return ans;
    }

    public static void subset(int idx, int[] arr, int sum, ArrayList<Integer> ans) {
        if (idx == arr.length) {
            ans.add(sum);
            return;
        }

        subset(idx + 1, arr, sum + arr[idx], ans);

        subset(idx + 1, arr, sum, ans);

    }
}
