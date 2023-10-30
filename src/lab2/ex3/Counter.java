package lab2.ex3;

public class Counter {

    int counter = 0;

    public void increment() {
        this.counter++;
    }

    public void incrementAndSet(int i) {
        i++;
        counter = i;
    }

    // Qui
    public void incrementAndSet(Counter c) {
        // this == counter
        // c == counter2
        c.counter++;
        counter = c.counter;
    }

    public String toString() {
        return Integer.toString(this.counter);
    }

}
