import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] divisors(int n) {
        List<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr.add(i);
            }
        }
        int[] ans = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i);
        }
        return ans;
    }
}