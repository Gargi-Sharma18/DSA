class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (st.isEmpty()) {
                st.push(ch);
            } else if (ch != st.peek()) {
                st.push(ch);
            } else {// ch == top
                st.pop();
            }
        }
        Stack<Character> temp = new Stack<>();
        while (!st.isEmpty()) {
            temp.push(st.pop());
        }
        StringBuilder ans = new StringBuilder();
        while (!temp.isEmpty()) {
            ans.append(temp.pop());
        }
        return ans.toString();
    }
}