import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombo(0, k, n, ans, new ArrayList<>());
        return ans;
    }

    public void findCombo(int idx, int k, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (target == 0) {
            if (ds.size() == k) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        for (int i = idx + 1; i <= target && i > 0 && i < 10; i++) {
            if (i > target)
                break;

            ds.add(i);
            findCombo(i, k, target - i, ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
}
