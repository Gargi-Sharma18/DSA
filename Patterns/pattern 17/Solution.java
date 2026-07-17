//     A
//    ABA
//   ABCBA
//  ABCDCBA
// ABCDEDCBA

public class Solution {
    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + j));
            }
            for (int j = i - 1; j >= 0 && i != 0; j--) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 5;
        pattern(n);
    }
}