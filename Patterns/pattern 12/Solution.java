
// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321

public class Solution {
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = n - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int k = n - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 5;
        pattern(n);
    }
}