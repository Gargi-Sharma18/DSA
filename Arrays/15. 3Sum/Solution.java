class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        // HashMap<List<Integer> , Integer> map = new HashMap<>();
        Arrays.sort(arr);
        int i = 0;
        int n = arr.length;
        while (i < n - 2) {
            if (i != 0 && arr[i - 1] == arr[i]) {
                i++;
                continue;
            }
            int left = i + 1;
            int right = n - 1;
            int sum = 0;

            while (left < right) {
                sum = arr[i] + arr[left] + arr[right];
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[left]);
                    list.add(arr[right]);
                    // Collections.sort(list);
                    // if(!map.containsKey(list)){
                    // map.put(list , 1);
                    // }
                    ans.add(list);
                    left++;
                    right--;
                    while (left < right && arr[left] == arr[left - 1]) {
                        left++;
                    }
                    while (left < right && arr[right] == arr[right + 1]) {
                        right--;
                        ;
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
            i++;
        }
        // for (List<Integer> list : map.keySet()) {
        // ans.add(list);555555
        // }
        return ans;
    }
}

// public List<List<Integer>> threeSum(int[] arr) {
// List<List<Integer>> ans = new ArrayList<>();
// HashMap<List<Integer> , Integer> map = new HashMap<>();
// int n = arr.length;
// for(int i = 0;i < n-2;i++){
// for(int j = i+1;j < n-1;j++){
// for(int k = j+1;k < n;k++){
// if(arr[i] + arr[j] + arr[k] == 0){
// List<Integer> list = new ArrayList<>();
// list.add(arr[i]);
// list.add(arr[j]);
// list.add(arr[k]);
// Collections.sort(list);
// if(!map.containsKey(list)){
// map.put(list , 1);
// }
// }
// }
// }
// }
// for (List<Integer> list : map.keySet()) {
// ans.add(list);
// }
// return ans;
// }