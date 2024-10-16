package v1ch08;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 刘季伟
 * @implNote 展示下界通配符的基本用法
 * @since 2024/10/16 15:13:51
 */
public class LowerBoundWildcard {
    public static void addNumbers(List<? super Integer> list) {
        list.add(1); // 可加入Integer类型的数据
        list.add(2);
    }

    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        addNumbers(numberList);

        System.out.println(numberList); // 输出：[1, 2]
    }
}
