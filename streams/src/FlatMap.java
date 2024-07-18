import java.util.stream.*;
/**
 * @author 刘季伟
 * @implNote 解决产生的是流的流的问题
 * @since 2024/7/18 16:44:43
 */
public class FlatMap {
    public static void main(String[] args) {
        Stream.of(1, 2, 3)
                .flatMap(i -> Stream.of("Gonzo", "Fozzie", "Beaker"))
                .forEach(System.out::println);
    }
}
