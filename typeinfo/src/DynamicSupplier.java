import java.util.function.*;
import java.util.stream.*;
/**
 * @author 刘季伟
 * @implNote 泛型语法使用示例
 * @since 2024/8/16 09:50:36
 */
class CountedInteger {
    private static long counter;
    private final long id = counter++;
    @Override
    public String toString() {return Long.toString(id);}
}

public class DynamicSupplier<T> implements Supplier<T> {
    private Class<T> type;
    public DynamicSupplier(Class<T> type) {
        this.type = type;
    }
    public T get() {
        try {
            return type.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Stream.generate(new DynamicSupplier<>(CountedInteger.class))
                .skip(10)
                .limit(5)
                .forEach(System.out::println);
    }
}
