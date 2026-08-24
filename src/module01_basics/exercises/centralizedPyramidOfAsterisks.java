package module01_basics.exercises;
import java.util.Random;

public class centralizedPyramidOfAsterisks {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();

        int height = random.nextInt(3, 11);

        System.out.println("This program will randomly select a number between 1 and 10. Then, it will construct a centralized pyramid of asterisks.");
        System.out.println("The random number is: " + height);
        System.out.print("Building the pyramid");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.println(".");
        Thread.sleep(500);


       for(int i = 1; i <= height; i++) {
           for(int j = height - i; j >= 0; j--) {
               System.out.print(" ");
           }
           for(int k = 1; k <= (i * 2 - 1) ; k++){
               System.out.print("*");
           }
           System.out.println();
       }
       }
    }