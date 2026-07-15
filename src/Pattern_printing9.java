public class Pattern_printing9 {
    static void main() {

        int n = 5;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
            }
            for (int col = 1; col <= n * 2 - 1; col++) {
                if (row == n || col == n - row + 1 || col == n + row - 1) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
