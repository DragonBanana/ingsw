package lab5.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,2,3,4,5);
        list.stream().forEach((x) -> System.out.println(x));
        list.stream().forEach(System.out::println);

        Optional<Integer> first = list.stream().findFirst();
        System.out.println(first);

        List<Integer> reverseSorted = list.stream().sorted(
                (x,y) -> {
                    if (x > y) {
                        return -1;
                    }
                    return 1;
                }).collect(Collectors.toList());
        System.out.println(reverseSorted);

        List<Integer> distinct = list
                .stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinct);

        boolean lessThan10 = list.stream().allMatch((x) -> x < 10);
        System.out.println(lessThan10);

    }

}
