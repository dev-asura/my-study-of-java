package module01_basics.exercises;

public class sumOfEvenNumbersFrom1To100 {
    public static void main(String[] args) {

        int result = 0;

        System.out.println("This program will calculate the sum of even number from 01 to 100.");

        for(int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        System.out.println(result);
    }
}
