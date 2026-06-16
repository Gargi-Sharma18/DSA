class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Prefix sum 0 has occurred once
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : arr) {
            sum += num;
            // Check if there exists a prefix sum = sum - k
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            // Store current prefix sum frequency
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;

    }
}
