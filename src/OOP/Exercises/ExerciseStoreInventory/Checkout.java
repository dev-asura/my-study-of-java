package OOP.Exercises.ExerciseStoreInventory;

public class Checkout {

    static double calculateTotal(Product... products){
        double total = 0;
        for(Product product : products) {
            total += product.calculateFinalPrice();
        }
        return total;
    }
}
