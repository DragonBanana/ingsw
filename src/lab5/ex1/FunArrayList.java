package lab5.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunArrayList<T> extends ArrayList<T> {

    public <S> FunArrayList<S> map(Function<T, S> f) {
        FunArrayList<S> result = new FunArrayList<>();
        for(T element: this) {
            result.add(f.apply(element));
        }
        return result;
    }

    public FunArrayList<T> filter(Predicate<T> f) {
        FunArrayList<T> result = new FunArrayList<>();
        for(T element: this) {
            if(f.test(element)) {
                result.add(element);
            }
        }
        return result;
    }

//    0.0
//    [1,2,3,4,5]
//
//    0.0 + 1 = 1.0
//    1.0 + 2 = 2.0
//    2.0 + 3 = 5.0
//    ...
//
//    ""
//    [9,8,7,6,1]
//    "" + 9 = "9"
//    "9" + 8  = "98"
//    "98" + 7 = "987"
//            ...

    public <S> S reduce(S initial, BiFunction<S,T,S> f) {
        S result = initial;
        for(T element: this) {
            result = f.apply(result, element);
        }
        return result;
    }

    public static int sum(Integer x, Integer y) {
        return x + y;
    }

    public static String concat(String s, Integer x) {
        return s + "_" + x;
    }

    public static String sumOne(int x) {
        return Integer.toString(x+1);
    }

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static void main(String[] args) {
        FunArrayList<Integer> fList = new FunArrayList<>();
        fList.add(10);
        fList.add(5);
        fList.add(20);

        System.out.println(fList);
        FunArrayList<String> mapList = fList.map(FunArrayList::sumOne);
        System.out.println(mapList);

        FunArrayList<Integer> filterList = fList.filter(FunArrayList::isEven);
        System.out.println(filterList);

        Integer reduceList = fList.reduce(0, FunArrayList::sum);
        System.out.println(reduceList);

        String reduceMultyTypeList = fList.reduce("init_", FunArrayList::concat);
        System.out.println(reduceMultyTypeList);

        FunArrayList<Integer> mapFastList = fList.map((x) -> x + 2);
        System.out.println(mapFastList);

        FunArrayList<Integer> filterFastList = fList.filter((x) -> x % 2 == 1);
        System.out.println(filterFastList);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(8);

        List<Integer> mapCommonList = list.stream().map((x) -> x * 2).collect(Collectors.toList());
        System.out.println(mapCommonList);

        Integer[] mapArray = list.stream().map((x) -> x * 2).toArray(Integer[]::new);
        System.out.println(mapArray);
    }
}
