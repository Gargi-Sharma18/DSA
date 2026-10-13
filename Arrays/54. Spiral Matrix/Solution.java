class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();

        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;
        
        while(ans.size() < m*n){

            for(int j = left;j <= right && ans.size() < m*n;j++){
                ans.add(matrix[top][j]);
            }
            top++;

            for(int i = top;i <= bottom && ans.size() < m*n;i++){
                ans.add(matrix[i][right]);
            }
            right--;

            for(int j = right;j >= left && ans.size() < m*n;j--){
                ans.add(matrix[bottom][j]);
            }
            bottom--;

            for(int i = bottom;i >= top && ans.size() < m*n;i--){
                ans.add(matrix[i][left]);
            }
            left++;
        }
        return ans;
    }
}