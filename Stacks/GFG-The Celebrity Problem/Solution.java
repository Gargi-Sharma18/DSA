class Solution {
    public int celebrity(int arr[][]) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();
            Boolean aFlag = true;
            Boolean bFlag = true;
            if (arr[a][b] == 1) {
                aFlag = false;
            } else {// arr[a][b] == 0
                bFlag = false;
            }
            if (arr[b][a] == 1) {
                bFlag = false;
            } else {// arr[b][a] == 0
                aFlag = false;
            }
            if (aFlag)
                st.push(a);
            if (bFlag)
                st.push(b);
        }
        if (st.size() == 0)
            return -1;
        int celeb = st.pop();

        for (int i = 0; i < n; i++) {
            if (i == celeb)
                continue;
            if (arr[i][celeb] == 0)
                return -1;
        }
        for (int j = 0; j < n; j++) {
            if (j == celeb)
                continue;
            if (arr[celeb][j] == 1)
                return -1;
        }
        return celeb;
    }
}
