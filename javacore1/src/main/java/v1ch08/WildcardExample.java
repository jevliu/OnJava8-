package v1ch08;
import java.util.*;
/**
 * @author 刘季伟
 * @implNote 展示泛型中的通配符的基本使用方法
 * @since 2024/10/16 15:05:09
 */
public class WildcardExample {
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }



    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);

        printList(stringList);
        printList(integerList);
    }
}
