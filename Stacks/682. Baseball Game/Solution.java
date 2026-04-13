class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            String ch = operations[i];

            if (!ch.equals("C") && !ch.equals("D") && !ch.equals("+")) {
                int num = Integer.parseInt(ch);
                st.push(num);
            } else if (ch.equals("C")) {
                st.pop();
            } else if (ch.equals("D")) {
                int addRecord = 2 * st.peek();
                st.push(addRecord);
            } else if (ch.equals("+")) {
                int top = st.pop();
                int preTwoSum = top + st.peek();
                st.push(top);
                st.push(preTwoSum);
            }
        }
        int sum = 0;
        while (!st.isEmpty()) {
            sum += st.pop();
        }
        return sum;
    }
}