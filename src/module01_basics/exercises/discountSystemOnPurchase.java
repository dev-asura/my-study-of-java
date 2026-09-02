package module01_basics.exercises;

public class discountSystemOnPurchase {
    public static void main(String[] args) {

        double price = 500.00;
        double discount = 0.15;
        double fixCoupon = 30.00;
        double finalPrice;

        finalPrice = calculateFinalPrice(price);
        System.out.printf("Final price: $%.2f", finalPrice);
        System.out.println();

        finalPrice = calculateFinalPrice(price, discount);
        System.out.printf("Final price: $%.2f", finalPrice);
        System.out.println();

        finalPrice = calculateFinalPrice(price, discount, fixCoupon);
        System.out.printf("Final price: $%.2f", finalPrice);

    }
    public static double calculateFinalPrice(double price){
        return price;
    }
    public static double calculateFinalPrice(double price, double percentageDiscount){
        return price -= price * percentageDiscount;
    }
    public static double calculateFinalPrice(double price, double percentageDiscount, double fixedCoupon){
        return price -= (price * percentageDiscount) + fixedCoupon;
    }
}
