/**
 * @author 刘季伟
 * @implNote 展示数组不一定是一个Iterable 页不会发生任何自动装箱
 * @since 2024/6/22 13:43:23
 */
import java.util.*;
public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> ib){
        for (T t : ib)
            System.out.print(t + " ");
    }

    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
        String[] strings = {"A", "B", "C"};
        test(Arrays.asList(strings));

    }
}
