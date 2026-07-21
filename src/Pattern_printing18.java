public class Pattern_printing18 {
    static void main() {

        int n = 4;

        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n - row; col++){
                System.out.print("  ");
            }
            for(int col = 1; col <= 2 * row - 1; col++) {
                if (col <= row) {
                    System.out.print(col + " ");
                }
               else
                    System.out.print(2 * row - col + " ");
           }
            System.out.println();
        }
    }
}
