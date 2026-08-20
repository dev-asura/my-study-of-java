package module01_basics.exercises;
import java.util.Scanner;
import java.util.Random;
public class aRPGDuel {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int charAttack;
        String posture;
        int dice;
        double damage;


        System.out.print("Enter your character base attack: ");

        while(!scanner.hasNextInt()) {
            System.out.print("The value must be an integer number.\nEnter your character base attack: ");
            scanner.next();
        }

        charAttack = scanner.nextInt();

        scanner.nextLine();

        do {
            System.out.println(" X - Dashing Attack");
            System.out.println(" Y - Defensive Attack");
            System.out.print("Choose your posture: ");
            posture = scanner.nextLine().trim();
        } while (!posture.equalsIgnoreCase("X") && !posture.equalsIgnoreCase("Y"));

        dice = random.nextInt(1, 21);
        System.out.println("\nRolling the dice..." + dice);


        if(dice == 20){
            damage = charAttack * 2;
            System.out.printf("\nAWESOME! Critical attack! Damage: %.2f", damage);
        } else if(dice == 1){
            damage = 0;
            System.out.printf("\nBAD LUCK! You miss. Damage: %.2f", damage);
        } else {
            if(posture.equalsIgnoreCase("X")){
                damage = charAttack + dice;
                System.out.printf("\nYou got it! Damage: %.2f", damage);
            } else {
                damage = charAttack + Math.floor(dice / 2.0);
                System.out.printf("\nYou git it! Damage: %.2f", damage);
            }
        }
        scanner.close();
    }
}
