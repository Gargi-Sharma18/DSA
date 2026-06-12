class Solution {
    public int totalFruit(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;

        int i = 0;
        int j = 0;
        while (j < n) {
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);

            while (map.size() > 2) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) - 1);

                if (map.get(arr[i]) == 0) {
                    map.remove(arr[i]);
                }
                i++;
            }

            int len = j - i + 1;
            maxLen = Math.max(len, maxLen);
            j++;
        }
        return maxLen;
    }
}
