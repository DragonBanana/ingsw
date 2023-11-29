package lab5.ex1;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Triangle> triangleList = new LinkedList();
        triangleList.add(new Triangle(1, 2, 1));
        triangleList.add(new Triangle(4, 8, 9));
        triangleList.add(new Triangle(2, 4, 2));

        System.out.println(triangleList);
        List<Square> squareList = triangleList.stream().map(
                (triangle) -> {
                    int area = triangle.area();
                    int side = (int) Math.sqrt(area);
                    return new Square(side);
                }).collect(Collectors.toList());
        System.out.println(squareList);

        List<Triangle> filteredList = triangleList.stream().filter(
                (x) -> x.perimeter() % 2 == 1
        ).collect(Collectors.toList());
        System.out.println(filteredList);

        Triangle t = triangleList.stream().reduce(new Triangle(0,0,0),
                (t1, t2) -> {
                    int area = t1.area() + t2.area();
                    return new Triangle(1, 2 * area, 5);
                }
        );
        System.out.println(t.area());
    }


}
