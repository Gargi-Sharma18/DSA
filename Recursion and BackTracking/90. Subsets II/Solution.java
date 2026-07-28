import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        subset(0, nums, new ArrayList<>(), ans);
        List<List<Integer>> list = new ArrayList<>(ans);
        return list;
    }

    public static void subset(int idx, int[] arr, List<Integer> ds, Set<List<Integer>> ans) {
        if (idx == arr.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[idx]);
        subset(idx + 1, arr, ds, ans);

        ds.remove(ds.size() - 1);

        subset(idx + 1, arr, ds, ans);
    }
}
