package module01_basics;

public class variables {
    public static void main(String[] args) {
        // Steps to create a variable
        // --------------------------
        // 1. declaration
        // 2. assignment

        int age = 23;
        int year = 2026;

        System.out.println("This code was made in " + year);
        System.out.println("My age is " + age);

        System.out.println("-----------------------------");

        double price = 19.98;
        double gpa = 3.5;
        double temperature = -12.5;

        System.out.println("This? It's $" + price);
        System.out.println("Your gpa is " + gpa);
        System.out.println("Today's temperature is " + temperature);

        System.out.println("-----------------------------");

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println("Your grade was " + grade + ". Congrats!");
        System.out.println("This is an exclamation point: " + symbol);
        System.out.println("Your actual currency is: " + currency);

        System.out.println("-----------------------------");

        boolean isStudent = false;
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println("This's a student of Java staring at the screen? " + isStudent);
        System.out.println("This's for sale? " + forSale);
        System.out.println("Is the student online now? " + isOnline);

        if(isStudent == true){
            System.out.println("You're a student!");
        } else {
            System.out.println("You're not a student!");
        }

        System.out.println("-----------------------------");

        String name = "Thiago L.";
        String food = "Pizza";
        String email = "fake@gmail.com";
        String car = "Mustang";
        String color = "Dark blue";

        System.out.println("My name's " + name);
        System.out.println("My favorite food is " + food);
        System.out.println("Please, send me an email, my address is: " + email);
        System.out.println("I have a car. It's a " + car + ". It's color is " + color);
    }
}
