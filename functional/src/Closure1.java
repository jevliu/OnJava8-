/**
 * @author 刘季伟
 * @implNote 展示再Java8中是如何支持有限闭包的实现的
 * @since 2024/6/23 13:07:15
 */
import java.util.function.*;
public class Closure1 {
    int i;
    IntSupplier makeFun(int x){
        // 返回的函数访问对象字段i 和方法参数x
        return () -> x + i++;
    }
}
