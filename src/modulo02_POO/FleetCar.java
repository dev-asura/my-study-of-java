package modulo02_POO;

public class FleetCar extends Vehicle{
    int seats;

    FleetCar(String brand, String model, double dailyRate, int seats){
        super(brand, model, dailyRate);
        this.seats = seats;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.print("Seats: " + seats);
        System.out.println();
    }
}
