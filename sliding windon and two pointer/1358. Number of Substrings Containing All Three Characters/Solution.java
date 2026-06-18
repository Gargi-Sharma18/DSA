class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int count = 0;
        int i = 0;
        int[] hash = new int[3];

        for (int j = 0; j < n; j++) {
            char ch = s.charAt(j);

            hash[ch - 'a']++;

            while (hash[0] > 0 && hash[1] > 0 && hash[2] > 0) {
                count += n - j;

                hash[s.charAt(i) - 'a']--;
                i++;
            }
        }
        return count;
    }
}
