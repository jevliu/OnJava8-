package v1ch08.pair2;

import java.time.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author 刘季伟
 * @implNote
 * @since 2024/10/6 16:13:42
 */
public class PairTest2 {
    public static void main(String[] args) {
        LocalDate[] birthdays = {
          LocalDate.of(1906, 12, 9),
          LocalDate.of(1816, 12, 10),
          LocalDate.of(1903, 12, 3),
          LocalDate.of(1910, 6, 22),
        };
       Pair<LocalDate> mm = ArrayAlg.minmax(birthdays);
       System.out.println("min = " + mm.getFirst());
       System.out.println("max = " + mm.getSecond());

       // 解决如何实例化泛型数组的问题，使用List代替数组
        List<Pair<LocalDate>> table = new ArrayList<>(1);
        table.set(0, new Pair<>(LocalDate.of(1999,1,1),
                LocalDate.of(2000,1,1)));


    }
}

class ArrayAlg {

    public static <T extends Comparable<? super T>> Pair<T> minmax(T[] a) {
        if (a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];

        for (T t : a) {
            if (min.compareTo(t) > 0) min = t;
            if (max.compareTo(t) < 0) max = t;
        }
        return new Pair<>(min, max);
    }
}

class Pair<T> {
    private T first;
    private T second;

    public Pair(T f, T s) {
        first = f;
        second = s;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}