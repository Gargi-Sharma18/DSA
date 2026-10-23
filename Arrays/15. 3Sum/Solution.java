class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<List<Integer> , Integer> map = new HashMap<>();
        Arrays.sort(arr);
        int i = 0;
        int n = arr.length;
        while(i < n-2){
            int left = i+1;
            int right = n-1;
            int sum = 0;
            
            while(left < right){
                sum = arr[i] + arr[left] + arr[right];
                if(sum == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[left]);
                    list.add(arr[right]);
                    Collections.sort(list);
                    if(!map.containsKey(list)){
                        map.put(list , 1);
                    }
                }
                if(sum < 0) left++;
                else right--;
            }
            i++;
        }
        for (List<Integer> list : map.keySet()) {
            ans.add(list);555555
        }
        return ans;
    }
}