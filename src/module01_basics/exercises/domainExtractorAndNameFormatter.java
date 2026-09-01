package module01_basics.exercises;
import java.util.Scanner;

public class domainExtractorAndNameFormatter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String domain;
        String initials;

        System.out.println("***************************************");
        System.out.println("* Domain Extractor and Name Formatter *");
        System.out.println("***************************************");

        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();
        name = name.trim();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        domain = email.substring(email.indexOf("@") + 1);

        initials = name.substring(0, 1);

        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == ' ') {
                initials += name.charAt(i + 1);
            }
        }
        System.out.println("Your initials: " + initials.toUpperCase());
        System.out.println("Your domain: " + domain);

        scanner.close();
    }
}
