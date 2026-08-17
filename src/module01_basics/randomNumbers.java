package module01_basics;
import java.util.Random;
public class randomNumbers {
    public static void main(String[] args){
        Random random = new Random();

        boolean coin;
        System.out.println("Heads or Tails, let's see the result: ");
        coin = random.nextBoolean();
        if (coin == true) {
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }

        /*
        double number;
        number = random.nextDouble(1, 11);
        System.out.println(number);
        */

        /*
        int number1;
        int number2;
        int number3;

        number1 = random.nextInt(1, 101);
        number2 = random.nextInt(1, 101);
        number3 = random.nextInt(1, 101);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        */
    }
}
