package modulo02_POO.ExerciseFleetManagement;

public class FleetManagement {
    public static void main(String[] args){

        Vehicle[] vehicles = {
                new Car("Ford", "Mustang", 60.99, 2),
                new Car("Porsche", "911 Carrera", 80.99, 2),
                new Car("Volkswagen", "Jetta GLI", 25.49, 5),
                new Truck("Volkswagen", "Constellation 17.320", 190.90, 13),
                new Truck("Volvo", "FH16 Aero", 210.80, 24)
        };

        for(Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            System.out.println();
        }

        System.out.println("Total number of vehicles in the fleet: " + Vehicle.totalVehiclesCreated);
    }
}
