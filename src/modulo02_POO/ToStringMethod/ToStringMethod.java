package modulo02_POO.ToStringMethod;


public class ToStringMethod {
    public static void main(String[] args) {

        // .toString() = Method inherited from the Object class.
        //               Used to return a string representation of an object.
        //               By default, it returns a hash code as a unique identifier.
        //               It can be overridden to provide meaningful details.

        Car car1 = new Car("Porsche", "911 Carrera", 2022, "Pink");
        Car car2 = new Car("Ford", "Mustang", 2024, "Dark Gray");
        System.out.println(car1.toString());
        System.out.println(car2.toString());


    }
}
