
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        int leader = 0;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= leader) {
                leader = arr[i];
                list.add(leader);
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            ans.add(list.get(i));
        }
        return ans;
    }
}
