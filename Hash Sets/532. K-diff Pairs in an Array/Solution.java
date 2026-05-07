class Solution {
    public int findPairs(int[] arr, int k) {
        HashSet<Integer> visit = new HashSet<>();
        HashSet<Integer> pair = new HashSet<>();

        for (int num : arr) {

            if (visit.contains(num - k)) {
                pair.add(num - k);
            }
            if (visit.contains(num + k)) {
                pair.add(num);
            }
            visit.add(num);
        }
        return pair.size();
    }
}