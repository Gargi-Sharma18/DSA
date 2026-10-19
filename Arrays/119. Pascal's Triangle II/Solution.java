class Solution {
    public List<Integer> getRow(int n) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);

        for (int i = 1; i <= n; i++) {
            ans.add(1);

            for (int j = i - 1; j > 0; j--) {
                ans.set(j, ans.get(j) + ans.get(j - 1));
            }
        }
        return ans;
    }
}

// class Solution {
// public List<Integer> getRow(int n) {
// List<List<Integer>> ans = new ArrayList<>();

// for(int i = 0;i <= n;i++){
// List<Integer> row = new ArrayList<>();
// for(int j = 0;j <= i;j++){
// if(j == 0 || j == i){
// row.add(1);
// }
// else{
// row.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
// }
// }
// ans.add(row);
// }
// return ans.get(n);
// }
// }