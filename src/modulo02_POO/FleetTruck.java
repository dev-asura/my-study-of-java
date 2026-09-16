package modulo02_POO;

public class FleetTruck extends Vehicle{

    double payloadCapacity;

    FleetTruck(String brand, String model, double dailyRate, double payloadCapacity){
        super(brand, model, dailyRate);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
    }
}
