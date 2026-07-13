public class Conditionals2 {

    public static void main(String[] args) {

        int age = 60;
        char gender = 'm';

        if (gender != 'M' && gender != 'm' &&
                gender != 'F' && gender != 'f'){
            System.out.println("Only Male and Female are allowed for marriage on our app");
        }
        else if(age < 18 )
            System.out.println("Too Young for marriage\n(child helpline number 9311551393)");


        else if (gender == 'M' || gender == 'm') {
            if (age > 60){
                System.out.println("Maximum age for marriage for Males on our app is 60");
            }
            else if (age >= 21) {
                System.out.println("Allowed for marriage as Male");
            } else {
                System.out.println("Male but not allowed (Age below 21)");
            }
        }

        else if (gender == 'F' || gender == 'f'){

            if (age > 58) {
                System.out.println("Maximum age for marriage for Females on our app is 58");
            }
            else if (age >= 18) {
                System.out.println("Allowed for marriage as Female");
            }
            else {
                System.out.println("Female but not allowed (Age below 18)");
            }
        }
    }
}