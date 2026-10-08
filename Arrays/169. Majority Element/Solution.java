class Solution {
    public int majorityElement(int[] arr) {
        int val = (int) Math.ceil((double) arr.length / 2);
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int i : map.keySet()) {
            if (map.get(i) >= val) {
                ans = i;
            }
        }
        return ans;
    }
}