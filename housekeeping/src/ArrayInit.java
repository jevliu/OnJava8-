/**
 * @author 刘季伟
 * @implNote 展示使用花括号来初始化数组的两种形式
 * @since 2024/4/19 12:56:11
 */
import java.util.*;
public class ArrayInit {
    public static void main(String[] args) {
        Integer[] a = {
                1,2,
                3,
        };
        Integer[] b = new Integer[]{
                1,2,
                3,
        };
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
