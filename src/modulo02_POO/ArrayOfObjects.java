package modulo02_POO;

public class ArrayOfObjects{
    public static void main(String[] args){

        NewCarArrayOfObjectsLesson[] cars = {
                                             new NewCarArrayOfObjectsLesson("Mustang", "Dark Gray"),
                                             new NewCarArrayOfObjectsLesson("Corvette", "Red"),
                                             new NewCarArrayOfObjectsLesson("911 Carrera", "Pink")
                                             };

        for(NewCarArrayOfObjectsLesson car : cars){
            car.color = "Black";
            car.drive();
        }

    }
}
