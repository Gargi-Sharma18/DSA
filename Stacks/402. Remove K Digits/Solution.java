class Solution {
    public String removeKdigits(String s, int k) {
        if(k == s.length()) return "0";
        Stack<Character> st = new Stack<>();

        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);

            while(!st.empty() && k > 0 && st.peek() > ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k > 0){
            st.pop();
            k--;
        }
        if(st.isEmpty()) return "0";
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        while(str.length() > 1 && str.charAt(str.length() - 1) == '0'){
            str.deleteCharAt(str.length() - 1);
        }
        str.reverse();
        return str.toString();
    }
}
