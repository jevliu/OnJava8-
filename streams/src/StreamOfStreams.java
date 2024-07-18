import java.util.stream.*;
/**
 * @author 刘季伟
 * @implNote 通过接受一个整数并产生一个字符串流的函数，展示map()产生的是流的流
 * @since 2024/7/18 16:39:48
 */
public class StreamOfStreams {
    public static void main(String[] args) {
        // 目标是得到字符串流，实际得到的是“Head"流，可以使用flatMap()解决这个问题
        Stream.of(1, 2, 3)
                .map(i -> Stream.of("Gonzo", "Kermit", "Beaker"))
                .map(e -> e.getClass().getName())
                .forEach(System.out::println);
    }
}
