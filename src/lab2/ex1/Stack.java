package lab2.ex1;

public class Stack {

    public static final int DEFAULT_STACK_SIZE = 10;
    int data[];
    int cur;

    //Costruttore di default con dimensione 10
    public Stack() {
        this(DEFAULT_STACK_SIZE);
    }

    //Costruttore con dimensione arbitraria
    public Stack(int size) {
        this.cur = 0;
        this.data = new int[size];
    }

    // Aggiunge un elemento allo stack
    public void push(int elem) {
        if(cur < this.data.length) {
            this.data[cur] = elem;
            this.cur++;
        }
    }

    // Rimuove l'ultimo elemento aggiunto
    public Integer pop() {
        if(cur > 0) {
            this.cur--;
            int elem = this.data[cur];
            return elem;
        }
        return null;
    }

    public String toString() {
        String result = "[";
        for (int i = 0; i < this.cur; i++) {
            result = result + this.data[i] + ",";
        }
        result = result + "]";
        return result;
    }

}
