package lab1.ex2;

public class Main {

    public static void main(String[] args) {
        Set set = new Set(10);
        System.out.println(set.isMember(0));
        System.out.println(set.isMember(5));

        set.add(0);
        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println(set.toString());
        System.out.println(set);

    }
}
