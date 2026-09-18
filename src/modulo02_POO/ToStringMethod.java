package modulo02_POO;


public class ToStringMethod {
    public static void main(String[] args) {

        // .toString() = Method inherited from the Object class.
        //               Used to return a string representation of an object.
        //               By default, it returns a hash code as a unique identifier.
        //               It can be overridden to provide meaningful details.

        ToStringMethodCar car1 = new ToStringMethodCar("Porsche", "911 Carrera", 2022, "Pink");
        ToStringMethodCar car2 = new ToStringMethodCar("Ford", "Mustang", 2024, "Dark Gray");
        System.out.println(car1.toString());
        System.out.println(car2.toString());


    }
}
