import java.util.stream.*;
/**
 * @author 刘季伟
 * @implNote 展示如何只需通过传递一个生成那些对象的lambda到generate()中来创建包含相同对象的流。
 * @since 2024/7/17 15:37:41
 */
public class Duplicator {
    public static void main(String[] args) {
        Stream.generate(() -> "duplicate").limit(3).forEach(System.out::println);
    }
}
