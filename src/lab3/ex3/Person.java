package lab3.ex3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static lab3.ex3.Utils.min;

public class Person implements Comparable<Person> {

    private String name;
    private String surname;
    private Date birthday;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Person(String name, String surname, Date birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    @Override
    // ritorna -1 se this e' piu' di person
    // ritorna 1 se this e' piu' grande
    // ritorno 0 se sono uguali
    public int compareTo(Person person) {
        int surnameComparison = this.surname.compareTo(person.surname);
        if (surnameComparison < 0) {
            return -1;
        } else if (surnameComparison == 0) {
            return this.name.compareTo(person.name);
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(
                new Person("mario",
                        "rossi",
                        new Date())
        );
        personList.add(
                new Person(
                        "luigi",
                        "bianchi",
                        new Date())
        );
        System.out.println(personList);
        System.out.println(min(personList));

    }
}
