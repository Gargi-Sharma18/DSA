class Solution {
    public String infixToPrefix(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(') {
                sb.setCharAt(i, ')');
            } else if (sb.charAt(i) == ')') {
                sb.setCharAt(i, '(');
            }
        }
        String prefix = infixToPostFix(sb.toString());
        StringBuilder ans = new StringBuilder(prefix);
        ans.reverse();
        return ans.toString();
    }

    public static String infixToPostFix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // if any character or digit occure
            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (st.peek() != '(') {
                    ans.append(st.pop());
                }
                st.pop(); // this is to pop opening braclet
            }
            // when an operator is scanned
            else {
                while (!st.isEmpty() && priority(ch) < priority(st.peek())) {
                    ans.append(st.pop());
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        return ans.toString();
    }

    public static int priority(char ch) {
        if (ch == '^')
            return 3;
        if (ch == '*' || ch == '/')
            return 2;
        if (ch == '+' || ch == '-')
            return 1;
        return 0;
    }
}