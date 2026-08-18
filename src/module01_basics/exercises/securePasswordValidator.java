package module01_basics.exercises;
import java.util.Scanner;
public class securePasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password;

        System.out.print("Please, enter your password: ");
        password = scanner.nextLine();

        if(password.length() < 8){
            System.out.println("The password must have 8 or more characters.");
        } else {
            if(password.startsWith(" ")){
                System.out.println("The password can't starts with blank space.");
            } else {
                if(password.equalsIgnoreCase("12345678") || password.equalsIgnoreCase("admin123")) {
                    System.out.println("The password can't be: 12345678 or admin123");
                } else {
                    if(password.contains("@")|| password.contains("#")){
                        System.out.println("Your password has been successfully created!");
                    } else {
                        System.out.println("Your password must have @ or #.");
                    }
                }
            }
        }
        scanner.close();
    }
}
