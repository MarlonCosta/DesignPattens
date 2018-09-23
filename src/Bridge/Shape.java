package Bridge;

abstract class Shape {
    Color cor;
    int borders = 0;

    Shape(int borders, Color cor) {
        this.borders = borders;
        this.cor = cor;
    }

    public int getBorders() {
        return this.borders;
    }

    public Color getColor() {
        return this.cor;
    }
}
