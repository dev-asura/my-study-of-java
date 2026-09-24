package OOP.Exercises.ExerciseFleetManagement;

public class Car extends Vehicle{
    int seats;

    Car(String brand, String model, double dailyRate, int seats){
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
