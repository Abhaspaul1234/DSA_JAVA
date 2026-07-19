public class Pattern_printing16 {
    static void main() {

        int n = 5;
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print((char) ('E' - (col - 1)) + " ");
            }
            System.out.println();
        }
    }
}
