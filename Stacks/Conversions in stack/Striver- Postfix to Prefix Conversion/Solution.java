class Solution {
    public String postToPre(String postfix) {
        // Your code goes here
        Stack<String> st = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            } else {
                String op2 = st.pop();
                String op1 = st.pop();
                st.push(ch + op1 + op2);
            }
        }
        return st.peek();
    }
}
