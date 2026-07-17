// E 
// D E 
// C D E 
// B C D E 
// A B C D E

public class Solution {
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j < n; j++) {
                System.out.print((char) ('A' + j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 5;
        pattern(n);
    }
}