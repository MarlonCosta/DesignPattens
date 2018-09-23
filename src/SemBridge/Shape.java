package SemBridge;

abstract class Shape {
    int borders = 0;

    Shape(int borders) {
        this.borders = borders;
    }
    public int getBorders() {
        return this.borders;
    }
}
