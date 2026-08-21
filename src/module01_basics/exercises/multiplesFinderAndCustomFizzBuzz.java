package module01_basics.exercises;
import java.util.Scanner;

public class multiplesFinderAndCustomFizzBuzz {
    public static void main(String[] args){

        int start = 1;
        int end = 100;
        int fizzBuzzCounter = 0;

        for(int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                fizzBuzzCounter++;
            } else if(i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        System.out.println("FizzBuzz counter: " +fizzBuzzCounter);
        }
    }
