package lab2.ex3;

public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter();

        System.out.println("counter1: " + counter);

        counter.increment();

        System.out.println("counter1: " + counter);

        int i = 3;

        System.out.println("counter1: " + counter + ", i: " + i);

        counter.incrementAndSet(i);

        System.out.println("counter1: " + counter + ", i: " + i);

        Counter counter2 = new Counter();

        System.out.println("counter1: " + counter + ", counter2: " + counter2 + ", i: " + i);

        counter2.incrementAndSet(i);

        System.out.println("counter1: " + counter + ", counter2: " + counter2 + ", i: " + i);

        counter.incrementAndSet(counter2);

        System.out.println("counter1: " + counter + ", counter2: " + counter2 + ", i: " + i);

    }
}
