package module01_basics;

import java.util.Scanner;

public class enhancedSwitches {
    public static void main(String[] args) {

        // Enhanced Switch = A replacement to many else if statements
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine().toLowerCase();
        switch(day){
            case "monday", "tuesday", "wednesday", "thursday", "friday" ->
                    System.out.println("It is a weekday!");
            case "saturday", "sunday" ->
                    System.out.println("It is a weekend day!");
            default ->
                    System.out.println(day + "is not a day");
        }
    }
}
