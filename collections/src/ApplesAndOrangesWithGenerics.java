/**
 * @author 刘季伟
 * @implNote 展示如何通过使用泛型，在编译期就防止将错误类型的对象放置到集合中。
 * @since 2024/4/28 10:49:07
 */
import java.util.*;
public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            apples.add(new Apple());
        }
        // 在编译期间就会报错
//        apples.add(new Orange());
        for (Apple apple : apples){
            // 通过使用泛型，在调用get()时会自动执行转型
            System.out.println(apple.id());
        }
    }
}
