class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
                }
            }
            ans.add(row);
        }
        return ans;
    }
}

// public List<List<Integer>> generate(int numRows) {
// int [][] arr = new int[numRows][];
// int n = numRows;
// List<List<Integer>> ans = new ArrayList<>();
// for(int i = 0;i < n;i++){
// arr[i] = new int[i+1];
// for(int j = 0;j <= i;j++){
// if(j == 0 || j == i){
// arr[i][j] = 1;
// }
// else{
// arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
// }
// }
// }
// for(int i = 0; i < arr.length; i++) {
// List<Integer> row = new ArrayList<>();

// for(int j = 0; j < arr[i].length; j++) {
// row.add(arr[i][j]);
// }
// ans.add(row);
// }
// return ans;
// }