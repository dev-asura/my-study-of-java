package module01_basics;
import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // while loop = repeat some code forever
        //              while some condition remains true.

        String response = "";

        System.out.println("Are u playing a game now!");
        System.out.print("If u want to quit, press 'Q': ");
        response = scanner.nextLine();

        while(!response.equalsIgnoreCase("Q")){
            System.out.print("Press 'Q' to quit the game: ");
            response = scanner.nextLine();
        }

        System.out.println("\nYOU QUIT!");
        scanner.close();
    }
}
