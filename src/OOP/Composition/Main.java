package OOP.Composition;

public class Main {
    public static void main(String[] args){

        // Composition = Represents a "part-of" relationship between two objects.
        //               For example, an Engine is "part of" a Car.
        //               Allows complex objects to be constructed from smaller objects.

        Car car = new Car("Charger", 2022, "V8");

        System.out.println(car.year + " " + car.model + " " + car.engine.type);
        car.start();
        car.engine.start();

    }
}
