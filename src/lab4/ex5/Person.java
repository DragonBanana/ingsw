package lab4.ex5;

public class Person extends Entity {

    private String name;
    private String surname;

    public Person(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void displayDetails() {
        System.out.println("id: " + id + ", name: " + name + ", surname: " + surname);
    }

}
