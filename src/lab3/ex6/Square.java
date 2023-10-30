package lab3.ex6;

public class Square extends Polygon {

    public int edge;

    public Square(int edge) {
        this.edge = edge;
    }

    @Override
    public double getPerimeter() {
        return edge * 4;
    }
}
