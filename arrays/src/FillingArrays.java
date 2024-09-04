import java.util.*;
import static onjava.ArrayShow.*;
/**
 * @author 刘季伟
 * @implNote 展示Array中的fill()方法，如何将单个值复制到整个数组
 * @since 2024/9/4 14:36:17
 */
public class FillingArrays {
    public static void main(String[] args) {
        int size = 6;
        boolean[] a1 = new boolean[size];
        byte[] a2 = new byte[size];
        int[] a3 = new int[size];
        String[] a4 = new String[size];

        // 使用fill()方法来复制填充
        Arrays.fill(a1, true);
        show("a1", a1);
        Arrays.fill(a2, (byte) 11);
        show("a2", a2);
        Arrays.fill(a3, 19);
        show("a3", a3);
        Arrays.fill(a4, "Hello");
        show("a4", a4);
    }
}
