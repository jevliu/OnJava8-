/**
 * @author 刘季伟
 * @implNote 展示动态数组的创建
 * @since 2024/4/19 12:46:37
 */

import java.util.*;
public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];
        System.out.println("length of a = " + a.length);
        System.out.println(Arrays.toString(a));
    }
}
