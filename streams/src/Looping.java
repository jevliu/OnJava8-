/**
 * @author 刘季伟
 * @implNote 使用自定义的repeat()来产生清晰的循环结构
 * @since 2024/7/17 15:16:32
 */
import static onjava.Repeat.*;
public class Looping {
    static void hi(){
        System.out.println("Hi!");
    }

    public static void main(String[] args) {
        repeat(3, () -> System.out.println("Looping!"));
        repeat(2, Looping::hi);
    }
}
