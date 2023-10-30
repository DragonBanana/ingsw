package lab4.ex4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//E - Element (used extensively by the Java Collections Framework)
//K - Key
//N - Number
//T - Type
//V - Value
//S,U,V etc. - 2nd, 3rd, 4th types
public class SafeStack<E> implements Iterable<E>{

    private int size;
    List<E> stack;
//    private T[] stack;

    public SafeStack() {
        this.stack = new ArrayList();
        this.size = 10;
    }

//    Se e' necessario utilizzare un tipo che non dipende dalla classe
//    public static <T> T getFirst(List<T> list) {
//        return list.get(0);
//    }

    public void safePush(E o) throws OutOfSizeException {
        if (stack.size() >= 10) {
            throw new OutOfSizeException();
        }
        stack.add(o);
    }

    public E safePop() throws EmptyStackException {
        if (stack.size() <= 0) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    public static void main(String[] args) {

        SafeStack<Integer> safeStack = new SafeStack();

        for(int i = 0; i<11; i++) {
            System.out.println(i);
            try {
                safeStack.safePush(new Integer(i));
            } catch (OutOfSizeException e) {
                System.out.println(e);
            }
        }

//        for(int i=0; i<11; i++) {
//            System.out.println(i);
//            try {
//                safeStack.safePop();
//            } catch (EmptyStackException e) {
//                System.out.println(e);
//            }
//        }

        Iterator<Integer> iterator = safeStack.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    @Override
    public Iterator<E> iterator() {
        return new StackIterator<E>(this);
    }

}

class StackIterator<E> implements Iterator<E> {

    private int i = 0;
    private SafeStack<E> safeStack;

    StackIterator(SafeStack safeStack) {
        this.safeStack = safeStack;
    }

    @Override
    public boolean hasNext() {
        return safeStack.stack.size() > i;
    }

    @Override
    public E next() {
        E element = safeStack.stack.get(i);
        i++;
        return element;
    }

}