package lab4.ex2;

class Father {

    int x;

    public Father(int x) {
        this.x = x;
    }

    public int m(Father f) {
        System.out.println("Father esegue m con parametro Father");
        return this.x - f.x;
    }

}

class Son extends Father {

    int y;

    public Son(int x, int y) {
        super(x);
        this.y = y;
    }

    public int m(Father f) {
        System.out.println("Son esegue m con parametro Father");
        return 100;
    }

    public int m(Son s) {
        System.out.println("Son esegue m con parametro Son");
        return super.m(s) + (s.y - this.y);
    }

}

public class Main {

    public static void main(String[] args) {
        Father f1, f2;
        Son s1, s2;
        f1 = new Father(3);
        f2 = new Son(3, 10);
        // f1 ha tipo statico Father
        // f1 ha tipo dinamico Father
        // f2 ha tipo statico Father
        // f2 ha tipo dinamico Son
        System.out.println("----1----");
        System.out.println(f1.m(f2));
        System.out.println("---------");

        System.out.println("----2----");
        System.out.println(f2.m(f1));
        System.out.println("---------");

        s1 = new Son(4, 21);
        // s1 ha tipo statico Son
        // s1 ha tipo dinamico Son
        System.out.println("----3a----");
        System.out.println(s1.m(f1));
        System.out.println("---------");
        System.out.println("----3b----");
        System.out.println(s1.m(f2));
        System.out.println("---------");
        System.out.println("----3----");
        System.out.println(s1.m(f1) + s1.m(f2));
        System.out.println("---------");

        System.out.println("----4a----");
        System.out.println(f1.m(s1));
        System.out.println("---------");
        System.out.println("----4b----");
        // f2 statico->Father dinamico->Son
        // s1 statico->Son dinamico->Son
        // f2.m(Father f)
        // Dentro la classe Father, Java non trova m(Son s)
        // A runtime, verrra' eseguito il metodo della classe Son
        // in particolare Son.m(Father f)
        System.out.println(f2.m(s1));
        System.out.println("---------");
        System.out.println("----4----");
        System.out.println(f1.m(s1) + f2.m(s1));
        System.out.println("---------");

        s2 = new Son(5, 22);
        System.out.println("----5----");
        System.out.println(s1.m(s2));
        System.out.println("---------");
    }


}
