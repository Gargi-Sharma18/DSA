
// 1
// 12
// 123
// 1234
// 12345

public class Solution {
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j + "");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 5;
        pattern(n);
    }
}
