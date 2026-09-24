package OOP.Exercises.ExerciseStoreInventory;

public class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double calculateFinalPrice(){
        return price;
    }
}

