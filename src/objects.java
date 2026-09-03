import java.util.Random;
import java.util.Scanner;

public class objects {
    public static void main(String[] args){

        // Object = An entity that holds data (attributes)
        //          and can perform actions (methods).
        //          It's a reference data type (HEAP)

        Car car = new Car();
        Car car2 = new Car();

        car.start();
        car.stop();

        car.drive();
        car.brake();

        System.out.println(car.make + " " + car.model);
        System.out.println(car2.make + " " + car2.model);
    }
}
