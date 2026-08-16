package module01_basics;
import java.util.Scanner;
public class ifStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // if statement = performs a block of code if its condition is true

        String name;
        int age;

        System.out.print("What's your name: ");
        name = scanner.nextLine();
        System.out.print("What's your age: ");
        age = scanner.nextInt();

        // GROUP 1
        if(name.isEmpty()){
            System.out.println("You didn't enter your name.");
            name = scanner.nextLine();
        } else {
            System.out.println("Hello " + name + "!");
        }

        // GROUP 2
        if(age >= 18 && age <= 120){
            System.out.println("You're an adult!");
        } else if(age < 18 && age >= 1){
            System.out.println("You're a child!");
        } else if(age > 120){
            System.out.println("Wow! You're some kind of immortal?");
        } else if (age == 0){
            System.out.println("You're a baby! Welcome to the world!");
        } else {
            System.out.println("You haven't been born yet!");
        }
        scanner.close();
    }
}
