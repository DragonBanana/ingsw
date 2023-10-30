package lab3.ex6;

public class Rectangle extends Polygon {

    public int width;
    public int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }
}
