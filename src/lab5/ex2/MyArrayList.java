package lab5.ex2;

import java.util.ArrayList;
import java.util.function.Predicate;

public class MyArrayList<T> extends ArrayList<T> {

    public MyArrayList<T> takewhile(Predicate<T> f) {
        MyArrayList<T> result = new MyArrayList<>();
        for (T elem: this) {
            if (f.test(elem)) {
                result.add(elem);
            } else {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("abc");
        list.add("d");
        list.add("efg");

        MyArrayList<String> list1 = list.takewhile((e) -> e.length() > 1);
        System.out.println(list1);

        MyArrayList<String> list2 = list.takewhile((e) -> e.length() > 0);
        System.out.println(list2);

        MyArrayList<String> list3 = list.takewhile((e) -> e.length() > 5);
        System.out.println(list3);
    }
}
