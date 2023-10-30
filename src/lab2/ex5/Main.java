package lab2.ex5;

import java.util.Date;


public class Main {

    public static void main(String[] args) {

        Student student = new Student("Davide", "Hu", new Date());

        Grade analisi1 = new Grade(18, 10);
        Grade analisi2 = new Grade(19, 10);

        student.addGrade(analisi1);
        student.addGrade(analisi2);

        System.out.println(student.meanGrade());
        System.out.println(student.canGraduate());

        Grade corsoMagico = new Grade(10, 160);
        student.addGrade(corsoMagico);

        System.out.println(student.meanGrade());
        System.out.println(student.canGraduate());
    }
}
