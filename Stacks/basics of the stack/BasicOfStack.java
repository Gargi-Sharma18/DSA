import java.util.Stack;

public class BasicOfStack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        System.out.println(st.isEmpty());// true or false
        st.push("gargi");
        st.push("yuva");
        st.push("dakshita");
        st.push("devansh");
        st.push("nish");
        System.out.println(st.size());
        System.out.println(st); // ye sare element pring ker ke de dega
        st.pop();// top element remobve ie is nish;
        System.out.println(st + " " + st.size());
        System.out.println(st.peek());// ye sirf show kerega top element
        System.out.println(st.pop());// it returns the top element and then remvoves it toh ye dono kam kera hai
                                     // basically peek then pop
        String s = st.pop(); // top se remove or s me store
    }
}
