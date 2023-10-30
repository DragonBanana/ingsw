package lab1.ex1;

public class Point {

    public float x;
    public float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public static float distance(Point p1, Point p2) {
        float squaredX = (p1.x - p2.x) * (p1.x - p2.x);
        float squaredY = (p1.y - p2.y) * (p1.y - p2.y);
        return (float) Math.sqrt(squaredX + squaredY);
    }

    public float distance(Point other) {
        float squaredX = (this.x - other.x) * (this.x - other.x);
        float squaredY = (this.y - other.y) * (this.y - other.y);
        return (float) Math.sqrt(squaredX + squaredY);
    }

}
