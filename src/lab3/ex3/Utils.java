package lab3.ex3;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static Comparable min(List<? extends Comparable> list) {
        Comparable actualMinimum = null;
        for(Comparable o: list) {
            if (actualMinimum == null) {
                actualMinimum = o;
            }
            if(o.compareTo(actualMinimum) < 0) {
                actualMinimum = o;
            }
        }
        return actualMinimum;
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("ciao");
        stringList.add("come");
        stringList.add("stai");
        stringList.add("?");
        System.out.println(min(stringList));
    }

}
