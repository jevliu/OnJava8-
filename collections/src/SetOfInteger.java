/**
 * @author 刘季伟
 * @implNote 存放Integer 对象的HashSet 使用示例
 * @since 2024/5/24 10:59:37
 */
import java.util.*;
public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<>();
        for (int i = 0; i < 10000; i++)
            intset.add(rand.nextInt(30));
        System.out.println(intset);
    }
}
