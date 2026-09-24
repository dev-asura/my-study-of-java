package OOP.Exercises.ExerciseFleetManagement;

public class Truck extends Vehicle{

    double payloadCapacity;

    Truck(String brand, String model, double dailyRate, double payloadCapacity){
        super(brand, model, dailyRate);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
    }
}
