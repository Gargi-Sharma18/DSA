class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> firstArr = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();

        for (int i : arr1) {
            firstArr.add(i);
        }
        for (int j : arr2) {
            if (firstArr.contains(j)) {
                ans.add(j);
            }
        }
        int[] result = new int[ans.size()];
        int k = 0;

        for (int num : ans) {
            result[k++] = num;
        }
        return result;
    }
}
