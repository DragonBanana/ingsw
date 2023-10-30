package lab1.ex1;

public class Main {

    public static void main(String[] args) {

        Point point1 = new Point(0.0f, 0.0f);
        Point point2 = new Point(0.0f, 1.0f);

        System.out.println(point1.distance(point2));

        Polygon polygon = new Polygon(4);

        polygon.setVertex(0, new Point(0.0f, 0.0f));
        polygon.setVertex(1, new Point(0.0f, 1.0f));
        polygon.setVertex(2, new Point(1.0f, 1.0f));
        polygon.setVertex(3, new Point(1.0f, 0.0f));

        System.out.println(polygon.getPerimeter());

    }

}
