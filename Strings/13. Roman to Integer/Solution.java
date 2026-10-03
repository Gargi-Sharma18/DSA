
class Solution {
    public int romanToInt(String s) {

        int total = 0;
        for (int i = 0; i < s.length(); i++) {

            if (i > 0 && roman(s.charAt(i - 1)) < roman(s.charAt(i))) {
                total += roman(s.charAt(i)) - roman(s.charAt(i - 1)) - roman(s.charAt(i - 1)); // do baar minus iss liye
                                                                                               // kiya kyu ki total me
                                                                                               // current value yoh plus
                                                                                               // ho hi thi hai toh do
                                                                                               // baar aajayi value jo
                                                                                               // choti hai cuurent se
            } else {
                total += roman(s.charAt(i));
            }
        }
        return total;
    }

    public static int roman(char rom) {
        switch (rom) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }
}