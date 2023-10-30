package lab2.ex5;

import java.util.Date;

public class Person {

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

}
