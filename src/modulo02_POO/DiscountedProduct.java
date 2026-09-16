package modulo02_POO;

public class DiscountedProduct extends Product{
    double discountedPercentage;

    DiscountedProduct(int id, String name, double price, double discountedPercentage){
        super(id, name, price);
        this.discountedPercentage = discountedPercentage;
    }

    @Override
    public double calculateFinalPrice() {
        return price - (price * (discountedPercentage / 100));
    }
}
