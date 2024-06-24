/**
 * @author 刘季伟
 * @implNote 展示当不使用泛型时，向一个Apple 类型的ArrayList 中加入Orange 对象会有什么效果
 * @since 2024/4/28 10:41:23
 */
import java.util.*;

class Apple{
    private static long counter;
    private final long id = counter++;
    public long id(){return id;}
}
class Orange{}
public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++){
            apples.add(new Apple());
        }
        // 再添加一个Orange 对象也没有问题
        apples.add(new Orange());
        for (Object apple : apples){
            ((Apple)apple).id();
            // Orange 对象只在运行时才会被检查出来
        }
    }
}
