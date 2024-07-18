import java.util.*;
import java.util.stream.*;
/**
 * @author 刘季伟
 * @implNote 展示如何从一个整数开始，然后使用每一个整数去创建更多的随机数。
 * @since 2024/7/18 17:14:59
 */
public class StreamOfRandoms {
    static Random rand = new Random(47);

    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5)
                .flatMapToInt(i -> IntStream.concat(
                        rand.ints(0, 100).limit(i), IntStream.of(-1)
                ))
                .forEach(n -> System.out.format("%d ", n));
    }
}
