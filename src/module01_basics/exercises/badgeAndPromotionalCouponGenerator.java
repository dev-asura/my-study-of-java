package module01_basics.exercises;
import java.util.Scanner;
import java.util.Random;
public class badgeAndPromotionalCouponGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String name;
        String role;
        int badgeID;
        int coupon;

        System.out.println("Badge and Promotional Coupon Generator");
        System.out.println("======================================");
        System.out.print("Enter your full name: ");
        name = scanner.nextLine().toUpperCase().trim();
        name = name.substring(0, name.indexOf(" "));
        System.out.print("Enter your role: ");
        role = scanner.nextLine().toUpperCase().trim();
        badgeID = random.nextInt(1000, 10000);

        if(role.equalsIgnoreCase("DEVELOPER") || role.contains("DEV")){
            role = "DEVELOPER";
            coupon = random.nextInt(20, 51);
            System.out.println("======================================");
            System.out.printf("\nWelcome %s, your ID is: %d. Because you're a %s, you have a %d%% of discount coupon in our stores.", name, badgeID, role, coupon);
        } else {
            coupon = 10;
            System.out.printf("\nWelcome %s, your ID is: %d. You have a %d%% discount coupon in our stores.", name, badgeID, coupon);
        }
        scanner.close();
    }
}
