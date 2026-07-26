
class Solution {
    public List<String> generateBinaryStrings(int n) {
        List<String> ans = new ArrayList<>();
        return generate(n, "", ans);
    }

    public List<String> generate(int n, String curr, List<String> ans) {
        if (curr.length() == n) {
            ans.add(curr);
            return ans;
        }
        ans = generate(n, curr + "0", ans);

        if (curr.isEmpty() || curr.charAt(curr.length() - 1) != '1') {
            ans = generate(n, curr + "1", ans);
        }
        return ans;
    }
}
