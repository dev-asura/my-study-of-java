package modulo02_POO.ExerciseFleetManagement;

public class Vehicle {

    String brand;
    String model;
    double dailyRate;
    static int totalVehiclesCreated = 0;

    Vehicle(String brand, String model, double dailyRate){
        this.brand = brand;
        this.model = model;
        this.dailyRate = dailyRate;
        totalVehiclesCreated++;
    }

    public void displayDetails(){
        System.out.println("Brand: " + brand + "\nModel: " + model + "\nDaily Rate: $" + dailyRate);
    }
}
