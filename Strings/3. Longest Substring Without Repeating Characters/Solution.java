class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;
        HashSet<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int maxLen = 1;

        while (j < s.length()) {
            char ch = s.charAt(j);
            if (!set.contains(ch)) {
                set.add(ch);
                j++;
            } else {
                int len = j - i;
                maxLen = Math.max(len, maxLen);
                while (s.charAt(i) != s.charAt(j)) {
                    set.remove(s.charAt(i));
                    i++;
                }
                i++;
                j++;
            }
        }
        int len = j - i;
        maxLen = Math.max(len, maxLen);
        return maxLen;
    }
}

// int n = s.length();
// int HashLen = 256;
// int[] hash = new int[HashLen];

// Arrays.fill(hash, -1);

// int l = 0, r = 0, maxLen = 0;
// while (r < n) {

// if (hash[s.charAt(r)] >= l) {
// l = Math.max(hash[s.charAt(r)] + 1, l);
// }
// int len = r - l + 1;
// maxLen = Math.max(len, maxLen);
// hash[s.charAt(r)] = r;
// r++;
// }
// return maxLen;
// }
// }

// int n = s.length();
// int maxLen = 0;

// for(int i = 0;i < n;i++){
// boolean[] seen = new boolean[256];
// int len = 0;

// for(int j = i;j < n;j++){
// char c = s.charAt(j);

// if(seen[c] == true){
// break;
// }

// seen[c] = true;
// len++;
// maxLen = Math.max(maxLen,len);
// }
// }
// return maxLen;
// }
