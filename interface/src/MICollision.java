/**
 * @author 刘季伟
 * @implNote 展示Java 8 之后引进的新特性，可以结合多个源的实现，只要基类方法中的方法名和参数列表不同，就能工作的很好。
 * @since 2024/4/27 09:46:46
 */
import java.util.*;

interface Bob1{
    default void bob(){
        System.out.println("Bob1::bob()");
    }
}
interface Bob2{
    default void bob(){
        System.out.println("Bob2::bob()"); // 两个接口有同样方法签名的默认方法，因此不可以同时被一个类实现
    }
}
interface Sam1{
    default void sam(int i){
        System.out.println(i * 2);
    }
}
interface Sam2{
    default void sam(){
        System.out.println("Sam2::sam()");
    }
}
class Sam implements Sam2, Sam1{}
public class MICollision {
    public static void main(String[] args) {
        Sam1 s = new Sam();
        s.sam(1);
    }
}
