/**
 * @author 刘季伟
 * @implNote IntStream 类提供了range()方法用于生成整型序列的流。编写循环时，这个方法会更加遍历。
 * @since 2024/7/17 15:05:06
 */
import java.io.FilterOutputStream;
import java.util.stream.IntStream.*;

import static java.util.stream.IntStream.range;

public class Ranges {
    public static void main(String[] args){
        // 传统计算一定范围内整数之和的方法
        int result = 0;
        for(int i  = 10; i < 20; i++){
            result += i;
        }
        System.out.println(result);

        // 使用for-in循环
        result = 0;
        // 使用range()创建了流并将其转换为数组，然后在for-in代码块中使用
        for(int i : range(10, 20).toArray())
            result += i;
        System.out.println(result);

        // 使用流
        System.out.println(range(10, 20).sum());
    }
}
