/**
 * @author 刘季伟
 * @implNote 使用TreeSet 可得到排序后的集合
 * @since 2024/5/24 11:04:04
 */
import java.util.*;
public class SortedSetOfString {
    public static void main(String[] args) {
        Set<String> colors = new TreeSet<>();
        for (int i = 0; i < 100; i++){
            colors.add("Yellow");
            colors.add("Blue");
            colors.add("Red");
            colors.add("Red");
            colors.add("Orange");
            colors.add("Blue");
            colors.add("Purple");
        }
        System.out.println(colors);
    }
}
