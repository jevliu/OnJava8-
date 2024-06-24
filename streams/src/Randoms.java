import java.util.*;
/**
 * @author 刘季伟
 * @implNote 展示如何使用流式编程随机展示5至20之间不重复的整数并进行排序。此例中没有定义任何变量。
 * @since 2024/6/24 14:59:19
 */
public class Randoms {
    public static void main(String[] args){
        // 没有明显的迭代语句，为内部迭代，这是流式编程的一个核心特征。
        new Random(47).ints(5, 20).distinct().limit(7).sorted()
                .forEach(System.out::println);
    }
}
