class Solution {
    public String prefixToInfix(String s) {
        // Your code goes here
        Stack<String> st = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            } else {
                String op1 = st.pop();
                String op2 = st.pop();
                st.push("(" + op1 + ch + op2 + ")");
            }
        }
        return st.peek();
    }
}
