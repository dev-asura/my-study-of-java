package modulo02_POO;

public class MethodOverriding {
    public static void main(String[] args){

        // Method overriding = When a subclass provides its own
        //                     implementation of a method that is already defined.
        //                     Allows for code reusability and give specific implementations.

        MODog dog = new MODog();
        MOCat cat = new MOCat();
        MOFish fish = new MOFish();

        dog.move();
        cat.move();
        fish.move();
    }
}
