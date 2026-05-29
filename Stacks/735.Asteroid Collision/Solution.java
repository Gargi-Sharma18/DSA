class Solution {
    public int[] asteroidCollision(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i < n;i++){
            if(arr[i] > 0){
                st.push(arr[i]);
            }
            else{
                while(!st.isEmpty() && Math.abs(arr[i]) > st.peek()){
                    if(arr[i] < 0 && st.peek() > 0){
                        st.pop();
                    }
                    else{
                        break;
                    }
                }
                if(!st.isEmpty() && (arr[i] < 0 && st.peek() < 0)){
                    st.push(arr[i]);
                    continue;
                }
                if(!st.isEmpty() && (st.peek() == Math.abs(arr[i]))){
                    if(arr[i] < 0 && st.peek() > 0){
                        st.pop();
                    }
                    continue;  
                }
                if(st.isEmpty()){
                    st.push(arr[i]);
                }
            }
        }
        if(st.isEmpty()) return new int[0];
        
        int[] result = new int[st.size()];
        for(int i = st.size() - 1;i >= 0;i--){
            result[i] = st.pop();
        }
        return result;
    }
}