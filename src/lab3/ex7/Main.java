package lab3.ex7;
class Father { }

class Son extends Father { }

class Main {
    public static void main(String[] s) {
        Father f = new Son();
        Father f2 = new Father();
        if (f instanceof Father)
            System.out.println("True");
        else
            System.out.println("False");
        System.out.println(f.getClass());
        System.out.println(f2.getClass());
        if (f.getClass() == f2.getClass())
            System.out.println("True");
        else
            System.out.println("False");
    }
}