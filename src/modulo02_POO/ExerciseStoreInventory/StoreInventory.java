package modulo02_POO.ExerciseStoreInventory;

public class StoreInventory {
    public static void main(String[] args){

    Product[] products = {
            new Product(1, "Iphone 17", 599.90),
            new Product(2, "Samsung S27", 559.90),
            new Product(3, "Macbook M4 Gray", 799.99),
            new DiscountedProduct(4, "Macbook M4 Dark blue", 799.99, 15),
            new DiscountedProduct(5, "iPad Air 11pol", 499.99, 10)
    };

        System.out.println("Final price: $" + Checkout.calculateTotal(products));
    }
}

