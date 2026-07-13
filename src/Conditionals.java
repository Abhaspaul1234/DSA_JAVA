public class Conditionals {
    static void main() {
//        int dailyPractice = 12;
//
//        if(dailyPractice >= 10) {
//            System.out.println("Good consistency");

//        int age = 10;
//        if(age >= 18)
//        System.out.println("You are eligible to vote");

//        int accuracy = 108;
//
//        if (accuracy > 100) {
//            System.out.println("Invalid accuracy");
//            }
//        else if (accuracy >= 90) {
//                System.out.println("Excellent");
//            } else if (accuracy >= 75) {
//                System.out.println("Good");
//            } else if (accuracy >= 60) {
//                System.out.println("Average");
//            }
//        else
//            System.out.println("Needs Improvement");
//        }
//    }

        int streakDays = 30;

        String status = (streakDays >= 35) ? "Consistent" : "Irregular";

        System.out.println(status);
    }
}