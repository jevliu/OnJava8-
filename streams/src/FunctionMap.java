import java.util.*;
import java.util.stream.*;
import java.util.function.*;
/**
 * @author 刘季伟
 * @implNote map(Function)：将函数操作应用在输入流的元素中，并将返回值传递到输出流
 * 中。
 * • mapToInt(ToIntFunction)：操作同上，但结果是 IntStream。
 * • mapToLong(ToLongFunction)：操作同上，但结果是 LongStream。
 * • mapToDouble(ToDoubleFunction)：操作同上，但结果是 DoubleStream。
 * 在这里，我们使用 map() 映射多种函数到一个字符串流中。代码示例：
 * @since 2024/7/18 16:17:08
 */
public class FunctionMap {
    static String[] elements = {"12", "", "23", "45"};

    static Stream<String> testStream(){
        return Arrays.stream(elements);
    }

    static void test(String descr, Function<String, String> func){
        System.out.println(" ---( " + descr + " )---");
        testStream().map(func).forEach(System.out::println);
    }

    public static void main(String[] args) {
        test("add brackets", s -> "[" + s + "]");
        test("Increment", s -> {
            try {
                return Integer.parseInt(s) + 1 + "";
            } catch (NumberFormatException e){
                return s;
            }
        });
        test("Replace", s -> s.replace("2", "9"));
        test("Take last digit", s -> s.length() > 0 ? s.charAt(s.length() - 1) + "" : s);
    }
}
