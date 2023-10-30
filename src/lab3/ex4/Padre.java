package lab3.ex4;

class Padre {
    Padre(int n) {
        System.out.println("Padre!" + n);
    }
}


class Figlio extends Padre {
    Figlio() {
        super(6);
        System.out.println("Figlio!");
    }
}


class Example {
    public static void main(String[] args) {
        Figlio p = new Figlio();
    }
}

