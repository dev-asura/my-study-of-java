package OOP.ArrayOfObjects;

public class ArrayOfObjects{
    public static void main(String[] args){

        Car[] cars = {
                                             new Car("Mustang", "Dark Gray"),
                                             new Car("Corvette", "Red"),
                                             new Car("911 Carrera", "Pink")
                                             };

        for(Car car : cars){
            car.color = "Black";
            car.drive();
        }

    }
}
