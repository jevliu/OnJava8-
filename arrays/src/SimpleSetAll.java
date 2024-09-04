import java.util.*;
import static onjava.ArrayShow.*;
/**
 * @author 刘季伟
 * @implNote 使用Array中的setAll()方法来用一个生成器生成不同的值
 * @since 2024/9/4 14:45:00
 */
class Bob {
    final int id;
    Bob(int n ) {id = n;}
    @Override
    public String toString() {return "Bob" + id;}
}

public class SimpleSetAll {
    public static final int SZ = 8;
    static int val = 1;
    static char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    static char getChar(int n) {return chars[n];}

    public static void main(String[] args) {
        int[] ia = new int[SZ];
        long[] la = new long[SZ];
        double[] da = new double[SZ];
        Arrays.setAll(ia, n -> n); // [1]将数组索引作为值插入数组
        Arrays.setAll(la, n -> n);
        Arrays.setAll(da, n -> n);
        show(ia);
        show(la);
        show(da);
        System.out.println();
        Arrays.setAll(ia, n -> val++); // [2]接受索引，使用val来生成结果
        Arrays.setAll(la, n -> val++);
        Arrays.setAll(da, n -> val++);
        show(ia);
        show(la);
        show(da);
        System.out.println();

        Bob[] ba = new Bob[SZ];
        Arrays.setAll(ba, Bob::new); // [3]方法引用有效,Bob构造器接收一个int参数
        show(ba);
        System.out.println();

        Character[] ca = new Character[SZ];
        Arrays.setAll(ca, SimpleSetAll::getChar); // [4]为基元生成包装类的数组，然后使用setAll()的泛型版本
        show(ca);
    }

}
