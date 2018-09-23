package Composite;

import java.util.ArrayList;
import java.util.List;

public class Box extends Item {

    List<Item> products = new ArrayList<Item>();

    @Override
    public double getPrice() {
        double sum = 0;
        for (Item p : products) {
            sum += p.getPrice();
        }
        return sum;
    }

    public void addProduct(Item prod, int quant) {
        for (int i = 0; i < quant; i++) {
            products.add(prod);
        }
    }

    public void addProduct(Item prod) {
        products.add(prod);
    }
}