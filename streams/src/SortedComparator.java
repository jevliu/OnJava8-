import java.util.*;
/**
 * @author 刘季伟
 * @implNote 同构传入Comparator 参数的形式来实现sorted() 的比较器实现
 * @since 2024/7/18 16:01:01
 */
public class SortedComparator {
    public static void main(String[] args) throws Exception {
        FileToWords.stream("Cheese.dat")
                .skip(10)
                .limit(10)
                .sorted(Comparator.reverseOrder()) // 向sorted() 传入Comparator参数
                .map(w -> w + " ")
                .forEach(System.out::print);
    }
}
