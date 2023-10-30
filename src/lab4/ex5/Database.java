package lab4.ex5;

import java.util.ArrayList;
import java.util.List;

public class Database<T extends Entity> {

    private List<T> data;

    public Database() {
        this.data = new ArrayList<>();
    }

    public void add(T element) {
        data.add(element);
    }

    public void remove(T element) {
        data.remove(element);
    }

    public T find(int id) {
        for(T e: data) {
            if (e.id == id) {
                return e;
            }
        }
        return null;
    }

    public void displayAll() {
        for(T e: data) {
            e.displayDetails();
        }
        System.out.println("-------");
    }

    public void add(List<T> list) {
        this.data.addAll(list);
    }

    public static void main(String[] args) {
        Database d = new Database();
        Person person = new Person(0, "mario", "rossi");
        Product product = new Product(1, "cosa", 1000);
        d.add(person);
        d.displayAll();
        d.add(product);
        d.displayAll();
        d.remove(person);
        d.displayAll();
        Entity foundProduct = d.find(product.id);
        foundProduct.displayDetails();
    }
}
