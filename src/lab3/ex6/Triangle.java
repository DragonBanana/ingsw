package lab3.ex6;

public class Triangle extends Polygon{

    private int edge1;
    private int edge2;
    private int edge3;

    public Triangle(int edge1, int edge2, int edge3) {
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }

    @Override
    public double getPerimeter() {
        return this.edge1 + this.edge2 + this.edge3;
    }
}
