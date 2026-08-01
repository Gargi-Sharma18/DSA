class Solution {
    static String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        helper(digits, 0, "", ans);
        return ans;
    }

    public void helper(String digits, int index, String current, List<String> ans) {
        if (current.length() == digits.length()) {
            ans.add(current);
            return;
        }

        String s = map[digits.charAt(index) - '0'];
        for (int i = 0; i < s.length(); i++) {
            helper(digits, index + 1, current + s.charAt(i), ans);
        }
    }
}
