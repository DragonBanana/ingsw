package lab3.ex5;

class Person {
    public void greet() {
        System.out.println("Arrivederci");
    }
}
class EasyPerson extends Person {
    public void greet() {
        System.out.println("Ciao");
    }
}
class FormalPerson extends Person {
    public void greet() {
        System.out.println("Saluti");
    }
}
class VeryFormalPerson extends FormalPerson {
    public void greet() {
        System.out.println("Distinti saluti");
    }
}


public class Example {

    public static void main(String[] args) {
        Person p = new Person();
        EasyPerson ep = new EasyPerson();
        FormalPerson fp = new FormalPerson();
        VeryFormalPerson vfp = new VeryFormalPerson();
        p.greet();
//        ep = p; // questo e' sbagliato
        p = ep;
        // p
        // tipo statico Person
        // tipo dinamico EasyPerson
        p.greet();
//        ep = fp;
        ep.greet();
        fp.greet();
        p = new FormalPerson();
        // p
        // tipo statico Person
        // tipo dinamico FormalPerson
        p.greet();
//        fp = p;  // errore
//        vfp = (VeryFormalPerson) fp;
//        fp = (FormalPerson) vfp;
        vfp.greet();
    }

}
