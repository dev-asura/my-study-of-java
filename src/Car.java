public class Car {

    String make = "Porsche";
    String model = "911 Carrera";
    int year = 2022;
    double price = 80000.99;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("You start the engine.");
    }
    void stop(){
        isRunning = false;
        System.out.println("You stop the engine.");
    }

    void drive(){
        System.out.println("You drive the " + model);
    }

    void brake(){
        System.out.println("You brake the " + model);
    }
}
