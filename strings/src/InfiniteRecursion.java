import java.util.*;
import java.util.stream.*;
/**
 * @author 刘季伟
 * @implNote 适用this关键字令toString()打印出类的地址
 * @since 2024/7/19 12:01:42
 */
public class InfiniteRecursion {
    @Override
    public String toString(){
        // 由于发生自动类型转换，出现了无限递归调用toString()的问题
//        return " InfiniteRecursion address: " + this + "\n";
        // 为了避免这一问题，要打印地址应该调用Object基类的toString()
        return " InfiniteRecursion address: " + super.toString() + "\n";
    }

    public static void main(String[] args) {
        Stream.generate(InfiniteRecursion::new)
                .limit(10)
                .forEach(System.out::println);
    }
}
