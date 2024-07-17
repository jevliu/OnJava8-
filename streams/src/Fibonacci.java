import java.util.stream.*;
/**
 * @author 刘季伟
 * @implNote Stream.iterate() 产生的流的第一个元素是种子（iterate 方法的第一个参数），然
 * 后将种子传递给方法（iterate 方法的第二个参数）。方法运行的结果被添加到流（作为
 * 流的第二个元素），并存储起来作为下次调用 iterate() 时的第一个参数，以此类推。
 * 我们可以利用 iterate() 生成一个斐波那契数列。
 * @since 2024/7/17 15:46:57
 */
public class Fibonacci {
    int x = 1;

    Stream<Integer> numbers(){
        return Stream.iterate(0, i -> {
            int result = x + i; // 当前数加上前一个数(x代表前一个斐波那契数，i是当前的斐波那契数)
            x = i; // 更新当前数，为下次计算做准备
            return result;
        });
    }

    public static void main(String[] args) {
        // 跳过前20个，然后取10个
        new Fibonacci().numbers().skip(20).limit(10).forEach(System.out::println);
    }
}
