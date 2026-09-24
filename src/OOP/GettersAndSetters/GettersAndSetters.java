package OOP.GettersAndSetters;

public class GettersAndSetters {
    public static void main(String[] args){

        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE
        // SETTERS = Methods that make a field WRITEABLE


        Car car = new Car("Charger", "Dark Gray", 29999);


        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

        car.setColor("Yellow");
        car.setPrice(28499);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

        car.setModel("Mustang");
        car.setColor("Dark Blue");
        car.setPrice(26999);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}
