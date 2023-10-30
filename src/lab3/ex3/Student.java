package lab3.ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import static lab3.ex3.Utils.min;

public class Student extends Person {

    private int id;
    private List<Grade> grades;

    public Student(String name, String surname, Date birthday) {
        super(name, surname, birthday);
        this.id = 0;
        this.grades = new ArrayList<Grade>();
    }

    public void addGrade(Grade grade) {
        this.grades.add(grade);
    }

    public double meanGrade() {
        double result = 0;
        int totalCredits = 0;
        if(grades.isEmpty()) {
            return -1;
        }
        for (Grade g: grades) {
            result += g.getPoints() *
                    g.getCredits();
            totalCredits += g.getCredits();
        }
//        for (int i = 0; i < this.grades.size(); i++) {
//            Grade g = this.grades.get(i);
//            result += g.getPoints() *
//                    g.getCredits();
//            totalCredits += g.getCredits();
//        }
        return result / totalCredits;
    }

    public boolean canGraduate() {
        int totalCredits = 0;
        for (Grade g : grades) {
            totalCredits += g.getCredits();
        }
        return totalCredits >= 180;
    }

//    public List<Grade> getGrades() {
//        return this.grades;
//    }

    public List<Grade> getGrades() {
        List<Grade> grades = new ArrayList<>();
        for (Grade g: this.grades) {
            grades.add(g);
        }
        return grades;
    }

    @Override
    public int compareTo(Person person) {
        int personComparison = super.compareTo(person);

        if(personComparison == 0) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (this.id < student.id) {
                    return -1;
                } else if (this.id == student.id) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                throw new RuntimeException("Can't compare student with something unknown");
            }
        }
        return personComparison;
    }

    public static void main(String[] args) {

        List<Student> personList = new ArrayList<>();
        personList.add(
                new Student("mario",
                        "rossi",
                        new Date())
        );
        personList.add(
                new Student(
                        "luigi",
                        "bianchi",
                        new Date())
        );
        personList.add(
                new Student(
                        "wario",
                        "neri",
                        new Date())
        );
        System.out.println(personList);
        System.out.println(min(personList));

        Collections.sort(personList);

        System.out.println(personList);

    }
}
