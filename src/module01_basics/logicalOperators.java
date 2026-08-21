package module01_basics;

public class logicalOperators {
    public static void main(String[] args) {

        // && -> AND
        // || -> OR
        // ! = NOT

        double temp = -20;
        boolean isSunny = false;

        if(temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is GOOD!");
            System.out.println("It's SUNNY outside!");
        } else if(temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is GOOD!");
            System.out.println("It's CLOUDY outside!");
        } else if(temp > 30 || temp < 0) {
            System.out.println("The weather is BAD!");
        }
    }
}
