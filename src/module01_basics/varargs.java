package module01_basics;
import java.util.Scanner;

public class varargs {
    public static void main(String[] args){

    // varargs = allow a method to accept a varying # of arguments
    //           makes methods more flexible, no need for overloaded methods
    //           java will pack the arguments into an array
    //           ... (ellipsis)
        Scanner scanner = new Scanner(System.in);

        double[] grades = new double[4];

        System.out.print("Enter your grades for the first quarter: ");
        grades[0] = scanner.nextDouble();
        System.out.print("Enter your grades for the second quarter: ");
        grades[1] = scanner.nextDouble();
        System.out.print("Enter your grades for the third quarter: ");
        grades[2] = scanner.nextDouble();
        System.out.print("Enter your grades for the fourth quarter: ");
        grades[3] = scanner.nextDouble();

        System.out.println(average(grades));

        scanner.close();
    }
    static double average(double... grades){
        double sum = 0;
        double average;
        for(double grade : grades){
            sum += grade;
        }
        average = sum / grades.length;
        return average;
    }
}
