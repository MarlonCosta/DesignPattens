package SemComposite;

import java.util.ArrayList;
import java.util.List;

public class Box {

    List<Object> products = new ArrayList<Object>();

    public double getPrice() {

        //Aqui eu tenho que me preocupar com que tipo de objeto estou pegando o preço
        double sum = 0;
        for (Object p : products) {
            if(p instanceof Box){
                sum += ((Box) p).getPrice();
            }
            else if (p instanceof Product){
                sum += ((Product) p).getPrice();
            }
        }
        return sum;
    }
}