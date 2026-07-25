
class Solution {
    public int helper(String s, int i, long result, int sign) {
        // recursive approch
        if (i >= s.length() || !Character.isDigit(s.charAt(i))) {
            return (int) (sign * result);
        }
        result = result * 10 + (s.charAt(i) - '0');

        if (result * sign <= Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        if (result * sign >= Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        return helper(s, i + 1, result, sign);
    }

    public int myAtoi(String s) {
        int n = s.length();
        int i = 0;

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        int sign = 1;
        if (i < n && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < n && s.charAt(i) == '+') {
            i++;
        }
        return helper(s, i, 0, sign);
    }
}
// int i = 0;
// int n = s.length();

// while(i < n && s.charAt(i) == ' '){
// i++;
// }

// int sign = 1;
// if(i < n && s.charAt(i) == '-'){
// sign = -1;
// i++;
// }
// else if(i < n && s.charAt(i) == '+'){
// i++;
// }

// long result = 0;
// while(i < n && Character.isDigit(s.charAt(i))){
// result = result * 10 + (s.charAt(i)-'0');
// i++;

// if(result * sign <= Integer.MIN_VALUE){
// return Integer.MIN_VALUE;
// }
// if(result * sign >= Integer.MAX_VALUE){
// return Integer.MAX_VALUE;
// }
// }
// return (int) (sign*result);
// }
// }