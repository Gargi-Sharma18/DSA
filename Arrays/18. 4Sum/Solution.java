class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        if (target >= Integer.MAX_VALUE)
            return new ArrayList<>();
        if (target <= Integer.MIN_VALUE)
            return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<List<Integer>, Integer> map = new HashMap<>();
        Arrays.sort(arr);
        int n = arr.length;
        for (int j = 0; j < n - 3; j++) {
            int i = j + 1;

            while (i < n - 2) {
                int left = i + 1;
                int right = n - 1;
                long sum = 0;

                while (left < right) {
                    sum = (long) arr[j] + arr[i] + arr[left] + arr[right];

                    if (sum == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[j]);
                        list.add(arr[i]);
                        list.add(arr[left]);
                        list.add(arr[right]);
                        Collections.sort(list);
                        if (!map.containsKey(list)) {
                            map.put(list, 1);
                        }
                    }
                    if (sum < target)
                        left++;
                    else
                        right--;
                }
                i++;
            }
        }
        for (List<Integer> list : map.keySet()) {
            ans.add(list);
        }
        return ans;
    }
}