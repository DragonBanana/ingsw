package lab1.ex1;

public class Polygon {

    public Point[] vertices;

    public Polygon(int numVertices) {
        this.vertices = new Point[numVertices];
    }

    public void setVertex(int i, Point vertex) {
        this.vertices[i] = vertex;
    }

    public float getPerimeter() {
        float perimeter = 0.0f;

        for (int i = 0; i < vertices.length - 1; i++) {
            perimeter += Point.distance(vertices[i], vertices[i+1]);
//            perimeter += vertices[i].distance(vertices[i + 1]);
        }
        perimeter += vertices[vertices.length - 1].distance(vertices[0]);

        return perimeter;


    }

}
