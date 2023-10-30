package lab4.ex5;

public class Product extends Entity {

    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public void displayDetails() {
        System.out.println("id: " + id + ", name: " + name + ", price: " + price);
    }
}
