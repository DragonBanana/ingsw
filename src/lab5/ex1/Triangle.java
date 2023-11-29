package lab5.ex1;

public class Triangle {

    // assumiamo il triangolo rettangolo
    // a e' l'altezza
    // b e' la base
    public int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int perimeter() {
        return a+b+c;
    }

    public int area() {
        return a*b/2;
    }

    public String toString() {
        return "TRIANGLE: " + a + " " + b + " " + c;
    }

}
