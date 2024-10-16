package v1ch08;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 刘季伟
 * @implNote 展示上界通配符的基本用法
 * @since 2024/10/16 15:10:06
 */
public class UpperBoundWildcard {
    public static void printNumbers(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        List<Number> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(3.14);
        doubleList.add(2.71);

        printNumbers(intList);
        printNumbers(doubleList);
    }
}