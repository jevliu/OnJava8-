/**
 * @author 刘季伟
 * @implNote 展示如果对同一个对象多次调用makeFun()，最终会得到多个函数，它们共享i的储存空间
 * @since 2024/6/23 13:12:15
 */
import java.util.function.*;
public class SharedStorage {
    public static void main(String[] args) {
        Closure1 c1 = new Closure1();
        IntSupplier f1 = c1.makeFun(0);
        IntSupplier f2 = c1.makeFun(0);
        IntSupplier f3 = c1.makeFun(0);

        // 输出结果每次i都增加1，表明储存是共享的
        System.out.println(f1.getAsInt());
        System.out.println(f1.getAsInt());
        System.out.println(f1.getAsInt());
    }
}
