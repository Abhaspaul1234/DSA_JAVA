public class Pattern_printing13 {
    static void main() {

        int n = 5;
        for(int row = 1; row <= n; row++){
            for(int col = 1 ; col <= row; col++){
//            int a = col;
//            int b = ('A'- 1);
//            int ans = a + b;
//            char FinalAns = (char)ans;
//                System.out.print(FinalAns +" ");
                System.out.print((char)('A' + (col - 1))+ " ");
            }
            System.out.println();
        }
    }
}
