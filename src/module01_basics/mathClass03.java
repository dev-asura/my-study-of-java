package module01_basics;
import java.util.Scanner;

public class mathClass03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Circumference = 2 * Math.PI * radius;
        // Area = Math.PI * Math.pow(radius, 2)
        // Volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3)

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius , 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius ,3);

        System.out.println("The circumference is: " + circumference + "cm");
        System.out.println("The area is: " + area + "cm²");
        System.out.println("The volume is: " + volume + "cm³");

        scanner.close();
    }
}
