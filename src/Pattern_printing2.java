public class Pattern_printing2 {
    public static void main() {

    int n = 5;

    for(int row = 1 ; row <= n; row++){

        // for each row -> col = row value(variable column)
        for(int col = 1; col <= row; col++){
            System.out.print("* ");
            }
        // move to next line
        System.out.println();
        }
    }
}