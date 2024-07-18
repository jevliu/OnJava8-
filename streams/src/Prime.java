import java.util.stream.*;
import static java.util.stream.LongStream.*;
/**
 * @author 刘季伟
 * @implNote 展示isPrime() 作为过滤器函数，来用于检测质数
 * @since 2024/7/18 16:05:52
 */
public class Prime {
    // 定义过滤函数，判断传入的数是否为质数
    public static Boolean isPrime(long n){
        // rangeClosed() 包含上限值，如果出现任何等于0的值则返回false,否则返回true
        return rangeClosed(2, (long) Math.sqrt(n)).noneMatch(i -> n % i == 0);
    }

    // 创建一个流，并将流中的每个元素都传入到过滤器中用于筛选数据
    public LongStream numbers(){
        return iterate(2, i -> i + 1).filter(Prime::isPrime);
    }

    public static void main(String[] args) {
        new Prime().numbers()
                .limit(10)
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();

        new Prime().numbers()
                .skip(90)
                .limit(10)
                .forEach(n -> System.out.format("%d ", n));
    }

}
