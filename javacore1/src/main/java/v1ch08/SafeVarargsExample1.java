package v1ch08;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 刘季伟
 * @implNote @SafeVarargs用于final实例方法
 * @since 2024/10/15 20:47:39
 */
public class SafeVarargsExample1 {

    @SafeVarargs
    public final <T> void addToList(List<T> list, T... items) {
        for (T item : items) {
            list.add(item);
        }
    }

    public static void main(String[] args) {
        SafeVarargsExample1 example1 = new SafeVarargsExample1();
        List<String> stringList = new ArrayList<>();
        example1.addToList(stringList, "apple", "banana", "cherry");

        System.out.println(stringList);
    }
}
