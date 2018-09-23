package Bridge;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(new Red());
        Rectangle rec = new Rectangle(new White());

        System.out.println(triangle.getBorders());
        System.out.println(triangle.getColor());

        System.out.println(rec.getBorders());
        System.out.println(rec.getColor());
    }
}
