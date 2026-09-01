package module01_basics;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {

        String[] fruits = {"apple", "orange", "banana", "coconut"};

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println();

        int numOfFruits = fruits.length;
        System.out.println(numOfFruits);

        System.out.println();

        fruits[0] = "pineapple";
        fruits[1] = "plum";
        fruits[2] = "strawberry";
        fruits[3] = "grapes";

        //Arrays.sort(fruits);
        //Arrays.fill(fruits, "pineapple");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println();

        Arrays.sort(fruits);
    }
}
