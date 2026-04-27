class Solution {
    public String infixToPostfix(String s) {
        // Your code goes here
        Stack<Integer> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // if letter or digit is occured
            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            }
            // if opening bracket occured
            else if (ch == '(') {
                st.push(ch);
            }
            // if closing bracket occured
            else if (ch == ')') {
                while (st.peek() != '(') {
                    ans.append(st.pop());
                }
                st.pop(); // this is to pop opening bracket
            }
            // any operator is occured
            else {
                while (!st.isEmpty() && priority(ch) <= priority(st.peek())) {
                    ans.append(st.pop());
                }
                st.push(ch); // push the current operator
            }
        }
        // pop all the element remaining in Stack
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        return ans.toString();
    }

    public static int priority(char c) {
        if (c == '^')
            return 3;
        else if (c == '*' || c == '/')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        return -1;
    }
}
