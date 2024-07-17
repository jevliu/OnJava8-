import java.util.stream.*;
/**
 * @author 刘季伟
 * @implNote Bubble.java中的bubbler()与Supplier<Bubble>是接口兼容的，可以将其方法引用直接传递给Stream.generate()
 * @since 2024/7/17 15:41:59
 */
public class Bubbles {
    public static void main(String[] args) {
        // 展示创建单独工厂类的另一种方式
        Stream.generate(Bubble::bubbler).limit(5).forEach(System.out::println);
    }
}
