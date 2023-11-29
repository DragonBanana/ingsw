package lab6.ex1;

public class Buffer {

    private int i;
    private char ch;
    private boolean empty;

    public Buffer(int i) {
        this.i = i;
        this.ch = ' ';
        this.empty = true;
    }

    public synchronized char read() {
        while(this.empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.empty = true;
        char returnedCharacter = this.ch;
        notify();
        return returnedCharacter;
    }

    public synchronized void write(char ch) {
        while(!this.empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.empty = false;
        this.ch = ch;
        this.notify();
    }

}
