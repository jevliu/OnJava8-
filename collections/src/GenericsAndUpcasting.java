/**
 * @author 刘季伟
 * @implNote 展示使用泛型时同样可以应用于向上转型
 * @since 2024/4/28 10:56:05
 */
import java.util.*;

class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class Braeburn extends Apple{}
public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for (Apple apple : apples){
            System.out.println(apple);
        }
    }
}
