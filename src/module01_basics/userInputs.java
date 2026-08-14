package module01_basics;
import java.util.Scanner;

public class userInputs {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);

         System.out.print("Enter your name: ");
        // String name = scanner.next();
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What's your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are u a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();


        System.out.println("Your name is " + name + " and you're " + age + " years old.");
        System.out.println("A saw here that your gpa is " + gpa + ".");

        if (isStudent == true) {
            System.out.print("Congrats " + name + " you're a student. The future is glorious!");
        } else {
            System.out.println("Our system says that you're not a student.");
        }
        */
        //---------------------------------------------------------------------

        // COMMOM ISSUES

        /* System.out.print("Enter your age: ");
        int newAge = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("You are " + newAge + " years old and your favorite color is " + color + ".");
         scanner.close(); */
        //---------------------------------------------------------------------

        // CALCULATE AREA OF A RECTANGLE

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("I will calculate the area of a rectangle. Give me its width and height.");
        System.out.print("Write down the width of the rectangle: ");
        width = scanner.nextDouble();
        System.out.print("Write down the height of the rectangle: ");
        height = scanner.nextDouble();
        area = height * width;
        System.out.print("The area of the rectangle is: " + area + "cm²");

        scanner.close();

    }
}
