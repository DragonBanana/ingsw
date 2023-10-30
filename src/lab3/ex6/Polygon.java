package lab3.ex6;

import java.util.ArrayList;
import java.util.List;

public abstract class Polygon {

    public abstract double getPerimeter();

    public static void printPerimeters(List<Polygon> list) {
        for (Polygon p : list) {
            System.out.println(p.getPerimeter());
        }
    }

    public static void main(String[] args) {
        List<Polygon> polygonList = new ArrayList<>();
        polygonList.add(new Triangle(4, 2, 0));
        polygonList.add(new Rectangle(4, 2));
        polygonList.add(new Square(4));
        Polygon.printPerimeters(polygonList);
    }

}
