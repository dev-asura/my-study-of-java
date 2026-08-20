package module01_basics.exercises;
import java.util.Scanner;
public class emailFormatValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email;



        while(true) {
            System.out.print("Enter an email: ");
            email = scanner.nextLine().trim();

            int atIndex = email.indexOf("@");

            if(!email.contains("@")){
                System.out.println("Error: the email must contains '@'.\n");
            } else if(email.startsWith("@") || email.endsWith("@") ){
                System.out.println("Error: the email can't begin or end with '@'.\n");
            } else if(!email.substring(atIndex + 1).contains(".")){
                System.out.println("Error: the email must contains and '.' after the '@'.\n");
            } else if(!email.endsWith(".com") && (!email.endsWith(".br"))){
                System.out.println("Error: the email must end with '.com' or '.br'.\n");
            } else {
                break;
            }
        }

        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1);

        System.out.println("Your username is: " + username + ".");
        System.out.println("Your domain is: " + domain + ".");
        scanner.close();
    }
}
