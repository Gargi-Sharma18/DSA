class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int required = target - arr[i];

            if (map.containsKey(required)) {
                return new int[]{map.get(required), i};
            }

            map.put(arr[i], i);
        }
        return new int[]{};
    }
}

// class Solution {
//     public int[] twoSum(int[] arr, int target) {
//         int[] ans = new int[2];
//         int n = arr.length;

//         for (int i = 0; i < n - 1; i++) {
//             int sum = arr[i];
//             for (int j = i + 1; j < n; j++) {
//                 if ((sum + arr[j]) == target) {
//                     ans[0] = i;
//                     ans[1] = j;
//                 }
//             }
//         }
//         return ans;
//     }
// }
