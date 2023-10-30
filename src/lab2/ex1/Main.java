package lab2.ex1;

public class Main {

    public static void main(String[] args) {

        Stack stack = new Stack();
        System.out.println(stack);

        stack.push(6);
        System.out.println(stack);

        int elem = stack.pop();
        System.out.println("elemento rimosso: " + elem);
        System.out.println(stack);

        // Questa riga genera NullPointerException
        //elem = stack.pop();

        Integer element = stack.pop();
        System.out.println("elemento rimosso: " + elem);
        System.out.println(stack);

        for (int i = 0; i < 20; i++) {
            stack.push(i);
            System.out.println(stack);
        }

    }

}
