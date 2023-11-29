package lab5.ex1;

public class Square {

    public int a;

    public Square(int a) {
        this.a = a;
    }

    public int perimeter() {
        return a * 4;
    }

    public int area() {
        return a * a;
    }

    public String toString() {
        return "SQUARE: " + a;
    }
}
