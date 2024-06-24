/**
 * @author 刘季伟
 * @implNote 展示如何通过接口来实现多继承
 * @since 2024/4/27 09:43:03
 */
import java.util.*;

interface One{
    default void first(){
        System.out.println("first");
    }
}
interface Two{
    default void second(){
        System.out.println("second");
    }
}
interface Three{
    default void third(){
        System.out.println("third");
    }
}
class MI implements One, Two, Three {}
public class MultipleInheritance {
    public static void main(String[] args) {
        MI mi = new MI();
        mi.first();
        mi.second();
        mi.third();
    }
}
