class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int max = 0;
        int count = 0;

        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }
        max = Math.max(max, count);

        for (int i = k; i < n; i++) {
            if (isVowel(s.charAt(i - k))) {
                count--;
            }
            if (isVowel(s.charAt(i))) {
                count++;
            }
            max = Math.max(count, max);
        }
        return max;
    }

    public boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
}
