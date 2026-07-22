public class Methods {
    static void print2_Table() {
        int n = 2;
    for(int i = 1; i <= 10; i++){
        int ans = n * i;
        System.out.println( n + " x " + i + " = " + ans);
    }
    }
    static void main() {
        int n = 2;
        System.out.println("Mulptiplication table of " + n);
        print2_Table();
        System.out.println("\nThank you");
    }
}
