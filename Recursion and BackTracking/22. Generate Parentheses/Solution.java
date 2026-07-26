class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack("", 0, 0, n, res);
        return res;
    }

    public void backtrack(String curr, int open, int close, int n, List<String> res) {
        if (curr.length() == 2 * n) {
            res.add(curr);
            return;
        }
        if (open < n)
            backtrack(curr + "(", open + 1, close, n, res);
        if (close < open)
            backtrack(curr + ")", open, close + 1, n, res);
    }
}

// List<String> ans = new ArrayList<>();
// generate("",n,ans);
// return ans;
// }
// public void generate(String curr,int n ,List<String> ans){
// if(curr.length() == 2*n){
// if(isvalid(curr)){
// ans.add(curr);
// }
// return;
// }
// generate(curr + "(", n , ans);
// generate(curr + ")", n , ans);
// }
// public boolean isvalid(String s){
// int balance = 0;
// for(char c : s.toCharArray()){
// if(c == '(') balance++;
// else balance--;
// if(balance < 0) return false;
// }
// return (balance == 0);
// }
// }
