class Solution {
    public int subarraysWithKDistinct(int[] arr, int k) {
        return (subArrayLessOrEqualK(arr, k) - subArrayLessThenK(arr, k));
    }

    public int subArrayLessOrEqualK(int[] arr, int k) {
        int n = arr.length;
        int i = 0;
        int subArray = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < n; j++) {

            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);

            while (map.size() > k) {
                map.put(arr[i], map.get(arr[i]) - 1);

                if (map.get(arr[i]) == 0) {
                    map.remove(arr[i]);
                }
                i++;
            }
            if (map.size() <= k) {
                subArray += j - i + 1;
            }
        }
        return subArray;
    }

    public int subArrayLessThenK(int[] arr, int k) {
        int n = arr.length;
        int i = 0;
        int subArray = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < n; j++) {

            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);

            while (map.size() >= k) {
                map.put(arr[i], map.get(arr[i]) - 1);

                if (map.get(arr[i]) == 0) {
                    map.remove(arr[i]);
                }
                i++;
            }
            if (map.size() < k) {
                subArray += j - i + 1;
            }
        }
        return subArray;
    }

}