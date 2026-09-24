package OOP.Inheritance;

public class Inheritance {
    public static void main(String[] args){

        // Inheritance = One class inherits the attributes and methods
        //               from another class.
        //               Child <- Parent <- Grandparent

    InheritanceDog dog = new InheritanceDog();
    InheritanceCat cat = new InheritanceCat();
    InheritancePlant plant = new InheritancePlant();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println();
        dog.eat();
        cat.eat();
        System.out.println();
        System.out.println(dog.lives);
        System.out.println(cat.lives);
        System.out.println();
        dog.speak();
        cat.speak();
        System.out.println();
        System.out.println(plant.isAlive);
        plant.photosynthesize();
    }
}
