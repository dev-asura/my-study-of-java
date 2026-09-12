package modulo02_POO;

public class NewCarArrayOfObjectsLesson {

        String model;
        String color;

        NewCarArrayOfObjectsLesson(String model, String color){
            this.model = model;
            this.color = color;
        }

        void drive(){
            System.out.println("You drive the car " + this.color + " " + this.model + ".");
        }
}
