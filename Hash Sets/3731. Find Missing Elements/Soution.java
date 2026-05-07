class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        int min = minimum(arr);
        int max = maximum(arr);

        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> ans = new HashSet<>();
        for (int n : arr) {
            ans.add(n);
        }
        for (int i = min; i <= max; i++) {
            if (!ans.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public int minimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }

    public int maximum(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
