//     * 
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *

public class Solution {
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i * 2; j++) {
                System.out.print("*" + "");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = ((n - i) * 2) - 1; j > 0; j--) {
                System.out.print("*" + "");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 5;
        pattern(n);
    }
}