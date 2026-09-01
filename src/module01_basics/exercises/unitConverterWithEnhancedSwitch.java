package module01_basics.exercises;
import java.util.Scanner;

public class unitConverterWithEnhancedSwitch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int option;
        double weight;
        double convertedWeight;

        System.out.println("**************************");
        System.out.println("* WEIGHT UNITS CONVERTER *");
        System.out.println("**************************");
        System.out.println("01 - kg to lb");
        System.out.println("02 - lb to kg");
        System.out.println("03 - g to oz");
        System.out.print("Choose an option (01 02 03): ");

        while(true){
            if(!scanner.hasNextInt()){
                System.out.print("Enter a valid option (01 02 03): ");
                scanner.next();
                continue;
            }
            option = scanner.nextInt();
            if(option < 1 || option > 3){
                System.out.print("Enter a valid option (01 02 03): ");
            } else {
                break;
            }
        }
        System.out.println("**************************");
        switch(option){
            case 1 -> {
                System.out.print("Enter the weight (in kg): ");
                while(true){
                    if(!scanner.hasNextDouble()){
                        System.out.print("Enter a valid weight: ");
                        scanner.next();
                        continue;
                    }
                    weight = scanner.nextDouble();
                    if(weight < 0){
                        System.out.print("Enter a valid weight: ");
                    } else {
                        break;
                    }
                }
                convertedWeight = weight * 2.20462;
                System.out.printf("\nConverted WEIGHT: %.3f lb/s", convertedWeight);
            }
            case 2 -> {
                System.out.print("Enter the weight (in lb): ");
                while(true){
                    if(!scanner.hasNextDouble()){
                        System.out.print("Enter a valid weight: ");
                        scanner.next();
                        continue;
                    }
                    weight = scanner.nextDouble();
                    if(weight < 0){
                        System.out.print("Enter a valid weight: ");
                    } else {
                        break;
                    }
                }
                convertedWeight = weight / 2.20462;
                System.out.printf("\nConverted WEIGHT: %.3f kg/s", convertedWeight);
            }
            case 3 -> {
                System.out.print("Enter the weight (in g): ");
                while(true){
                    if(!scanner.hasNextDouble()){
                        System.out.print("Enter a valid weight: ");
                        scanner.next();
                        continue;
                    }
                    weight = scanner.nextDouble();
                    if(weight < 0){
                        System.out.print("Enter a valid weight: ");
                    } else {
                        break;
                    }
                }
                convertedWeight = weight / 28.34952;
                System.out.printf("\nConverted WEIGHT: %.3f oz", convertedWeight);
            }
        }
        scanner.close();
    }
}
