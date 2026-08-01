import java.util.*;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();
        palPartition(0, s, path, ans);
        return ans;
    }

    public void palPartition(int index, String s, List<String> path, List<List<String>> ans) {
        if (index == s.length()) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (palindrome(s, index, i)) {
                path.add(s.substring(index, i + 1));
                palPartition(i + 1, s, path, ans);
                path.remove(path.size() - 1);
            }
        }
    }

    boolean palindrome(String s, int i, int j) {
        while (i <= j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
