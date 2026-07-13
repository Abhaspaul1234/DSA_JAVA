import java.util.Scanner;

public class Switch_statement {

    public static void main(){
        System.out.println("Enter the value of day");

        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch(day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tueday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Invalid value");

        }
    }

}
