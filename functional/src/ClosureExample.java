import java.util.function.Function;

/**
 * @author 刘季伟
 * @implNote 使用lambda表达式来实现闭包的示例
 * @since 2024/6/23 13:28:10
 */
public class ClosureExample {
    public static Function<Integer, Integer> creatMultiplier(int factor){
        return x -> x * factor;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> times2 = creatMultiplier(2);
        Function<Integer, Integer> times5 = creatMultiplier(5);

        System.out.println(times2.apply(4));
        System.out.println(times5.apply(5));
    }
}
