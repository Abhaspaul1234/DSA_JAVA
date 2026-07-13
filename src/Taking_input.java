import java.util.Scanner;

public class Taking_input {
    static void main() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for the firstNum");
        int num1 = sc.nextInt();

        System.out.println("Enter the value for the secondNum");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum is: " + sum);

        sc.close();

    }
}
