import java.util.*;
import java.util.stream.*;
/**
 * @author 刘季伟
 * @implNote 展示产生数值输出流
 * @since 2024/7/18 16:34:38
 */
public class FunctionMap3 {
    public static void main(String[] args) {
        Stream.of("5", "7", "9")
                .mapToInt(Integer::parseInt)
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();

        Stream.of("17", "19", "23")
                .mapToDouble(Double::parseDouble)
                .forEach(n -> System.out.format("%f ", n));
    }
}
