package lab2.ex5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

}
