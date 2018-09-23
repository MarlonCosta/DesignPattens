package Composite;

public class Product extends Item {
    double price = 0;

    public Product(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
