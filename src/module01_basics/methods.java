package module01_basics;

public class methods {
    public static void main(String[] args) {

        // method = a block of REUSABLE code that is executed when called ()

        double number = 3;
        String firstName = "Spongebob";
        String lastName = "Squarepants";
        int age = 27;

        System.out.println(square(number));
        System.out.println(cube(number));
        System.out.println(getFullName(firstName, lastName));

        if (ageCheck(age)) {
            System.out.println("You may sign up!");
        } else {
            System.out.println("You must be 18+ to sign up!");
        }
    }
        static void happyBirthday(String birthdayBoy, int age) {
            System.out.println("Happy Birthday to you!");
            System.out.printf("Happy Birthday dear %s!\n", birthdayBoy);
            System.out.printf("You are %d years old!\n", age);
            System.out.println("Happy Birthday to you!\n");
        }
        static double square(double number){
            return number * number;
        }
        static double cube(double number){
            return number * number * number;
        }
        static String getFullName(String first, String last){
            return first + " " + last;
        }
        static boolean ageCheck(int age){
            return age >= 18;
        }
}

