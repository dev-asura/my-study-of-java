package module01_basics;
import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        // for loop = execute some code a CERTAIN amount of times

        System.out.print("How many second to countdown from?: ");
        int start = scanner.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY NEW YEAR!");

        scanner.close();
    }
}
