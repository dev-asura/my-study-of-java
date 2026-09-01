package module01_basics;
import java.util.Arrays;
import java.util.Scanner;

public class searchAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 9, 2, 8, 3, 4, 6, 2, 5, 0};
        String[] fruitsInTheFridge = {"apple", "orange", "banana", "pineapple", "coconut", "plum", "grapes", "strawberry", "mango"};
        int target = 2;

        System.out.print("Enter the name of a fruit to check if we have it in the fridge: ");
        String newTarget = scanner.nextLine();
        boolean isFound = false;
        boolean newIsFound = false;

        for(int i = 0; i < fruitsInTheFridge.length; i++) {
            if(newTarget.equals(fruitsInTheFridge[i])){
                System.out.println(fruitsInTheFridge[i].toUpperCase() + " found in the fridge. At index: " + i);
                newIsFound = true;
            }
        }
        if(!newIsFound){
            System.out.println("Fruit not found in the fridge!");
        }

        for(int i = 0; i < numbers.length; i++){
            if(target == numbers[i]){
                System.out.println("Number found at index: " + i);
                isFound = true;
            }
        }
        if(!isFound){
            System.out.println("Number not found in the array!");
        }

        scanner.close();
    }
}
