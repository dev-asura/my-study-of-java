package OOP.Exercises.OrderManagementSystem;

public class Main {
    public static void main(String[] args){

        Product product01 = new Product("Doritos", 1.99);
        Product product02 = new Product("Coca-Cola", 3.99);
        Product product03 = new Product("Snikers", 0.89);

        OrderItem item01 = new OrderItem(product01, 3);
        OrderItem item02 = new OrderItem(product02, 4);
        OrderItem item03 = new OrderItem(product03, 2);

        Order order = new Order(01, item01, item02, item03);

        order.printReceipt();
    }
}
