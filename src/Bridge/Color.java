package Bridge;

class Color {
    int red;
    int green;
    int blue;
    int opacity;

    Color(int red, int green, int blue, int opacity) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.opacity = opacity;
    }

    Color (){

    }

    @Override
    public String toString() {
        return "Color{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                ", opacity=" + opacity +
                '}';
    }
}
