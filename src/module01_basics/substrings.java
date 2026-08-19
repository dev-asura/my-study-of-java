package module01_basics;
import java.util.Scanner;
public class substrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // substring() = A method used to extract a portion of a string
        // .substring(start, end)

        // Email Slicer Program

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.next();
        if(email.contains("@") && email.contains(".com")) {
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);
            System.out.println("Your username is: " + username);
            System.out.println("Your domain is: " + domain);
        } else {
            System.out.println("Your email isn't valid. Emails must contain @.");
        }
        scanner.close();
    }
}
