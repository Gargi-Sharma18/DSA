class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int longestSubString = -1;
        int i = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() > k) {
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);

                if (map.get(s.charAt(i)) == 0) {
                    map.remove(s.charAt(i));
                }
                i++;
            }
            if (map.size() == k) {
                int len = j - i + 1;
                longestSubString = Math.max(longestSubString, len);
            }
        }
        return longestSubString;
    }
}
