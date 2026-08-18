package module01_basics.exercises;
import java.util.Scanner;

public class nameAndLoginFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        name = name.trim();

        System.out.printf("\nHello %s", name.toUpperCase());
        System.out.printf("\nHello %s", name.toLowerCase());

        if(name.contains("Silva")) {
            System.out.println("\nYou're a member of Silva family.");
        } else {
            System.out.println("\nYou're NOT a member of Silva family.");
        }

        int nameLength = name.replace(" ", "").length();
        System.out.printf("Your name have %d characters (without count spaces).", nameLength);

        if(name.length() > 5) {
            String username = name.substring(0, 3);
            System.out.printf("\nHere is your username: %s%d.", username, nameLength);
        } else {
            System.out.println("\nThanks for coming!");
        }
        scanner.close();
    }
}
