package Composite;

public class Main {
    public static void main (String[] args){
        Box caixaMaior = new Box();
        Box caixaBananas = new Box();
        Box caixaTomate = new Box();
        Box caixaMorangos = new Box();

        Product banana = new Product(2.0);
        Product tomate = new Product(3.0);
        Product morango = new Product(4.0);


        caixaMaior.addProduct(caixaBananas);
        caixaMaior.addProduct(caixaTomate);
        caixaMaior.addProduct(caixaMorangos);

        caixaBananas.addProduct(banana, 10);
        caixaMorangos.addProduct(morango, 5);
        caixaTomate.addProduct(tomate, 12);

        System.out.println(caixaMaior.getPrice());
    }
}
