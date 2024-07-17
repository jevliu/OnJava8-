package onjava;
import static java.util.stream.IntStream.*;
/**
 * @author 刘季伟
 * @implNote 实用小功能repeat()可以用来替换简单的for循环
 * @since 2024/7/17 15:13:49
 */
public class Repeat {
    public static void repeat(int n, Runnable action){
        range(0, n).forEach(i -> action.run());
    }
}
