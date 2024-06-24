/**
 * @author 刘季伟
 * @implNote 展示如何通过Stream.of() 来将一组元素转化为流，即创建一个流
 * @since 2024/6/24 15:15:13
 */
import java.util.stream.*;
public class StreamOf {
    public static void main(String[] args) {
        Stream.of(new Bubble(1), new Bubble(2), new Bubble(3)).forEach(System.out::println);
        Stream.of("It's ", "a ", "wonderful ", "day ", "for ", "pie!").forEach(System.out::print);
        System.out.println();
        Stream.of(3.14159, 2.718, 1.618).forEach(System.out::println);
    }
}
