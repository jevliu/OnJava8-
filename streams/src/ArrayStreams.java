import java.util.*;
import java.util.stream.*;
/**
 * @author 刘季伟
 * @implNote Arrays 类中含有一个名为 stream() 的静态方法用于把数组转换成为流。
 * @since 2024/7/17 16:16:02
 */
public class ArrayStreams {
    public static void main(String[] args) {
        Arrays.stream(new double[] {3.14159, 2.718, 1.618})
                .forEach(n -> System.out.format("%f ", n));
        System.out.println();

        Arrays.stream(new int[] {1, 3, 5})
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();

        Arrays.stream(new long[] {11, 22, 33, 44})
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();

        // 可以自定义选择一个子域
        Arrays.stream(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 3, 6)
                .forEach(n -> System.out.format("%d ", n));
    }
}
