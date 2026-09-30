package OOP.Exercises.OrderManagementSystem;

public class Order {

    private int orderId;
    private OrderItem[] items;

    Order(int orderId, OrderItem... items){
        this.orderId = orderId;
        this.items = items;
    }

    public void printReceipt(){
        double grandTotal = 0;
        for(OrderItem item : items){
            grandTotal += item.getSubtotal();
            System.out.println(item.getSubtotal());
        }
        System.out.printf("Total: %.2f", grandTotal);
    }
}
