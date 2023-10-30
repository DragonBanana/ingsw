package lab2.ex4;

public class Main {

    public static void main(String[] args) {
        String s1 = "Guess who";
        String s2 = s1;
        String s3 = "ABC";

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
        System.out.println("---------------------");

        s1 = s1 + " is back";

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
        System.out.println("---------------------");

        s1 = s3;
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
        System.out.println("---------------------");

        new StringBuilder().append("Guess who").append(" is back");

        String sottostringa = "Guess who".substring(0, 2);

// HEAP
// Constant String Pool
// ["g", "u", ..., "w", "h", o"]
// [" ", "i", "s", ... ]
// ["g", "u", ..., "w", "h", o", " ", "i", "s", ...]
//








    }

}
