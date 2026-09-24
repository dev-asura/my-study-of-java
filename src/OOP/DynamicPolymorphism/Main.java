package OOP.DynamicPolymorphism;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Animal animal;
        int choose;

        System.out.print("Would you like a dog or a cat (1 = dog, 2 = cat): ");
        choose = scanner.nextInt();

        if(choose == 1){
            animal = new Dog();
            animal.speak();
        } else if(choose == 2){
            animal = new Cat();
            animal.speak();
        }
    }
}
