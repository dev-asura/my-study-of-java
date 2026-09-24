package modulo02_POO;

public class Polymorphism {
    public static void main(String[] args){

        // Polymorphism = "POLY" = "MANY"
        //                "MORPH" = "SHAPE"
        //                Objects can identify as other objects.
        //                Objects can be treated as objects of a common superclass.


        PolyCar car = new PolyCar();
        PolyBike bike = new PolyBike();
        PolyBoat boat = new PolyBoat();

        PolyVehicle[] vehicles = {car, bike, boat};

        for(PolyVehicle vehicle : vehicles) {
            vehicle.go();
        }
    }
}
