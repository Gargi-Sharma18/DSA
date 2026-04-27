class Solution {
    public String postToInfix(String postExp) {
        // Your code goes here
        Stack<String> st = new Stack<>();
        for (int i = 0; i < postExp.length(); i++) {
            char ch = postExp.charAt(i);
            // if the expression is char or digit
            if (Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            } else {
                String op2 = st.pop();
                String op1 = st.pop();
                st.push("(" + op1 + ch + op2 + ")");
            }
        }
        return st.peek();
    }
}
