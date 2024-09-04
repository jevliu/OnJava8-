import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author 刘季伟
 * @implNote 展示如何逐个构建非基元的对象数组
 * @since 2024/9/4 13:57:54
 */
public class AssemblingMultidimensionalArrays {
    public static void main(String[] args) {
        Integer[][] a;
        a = new Integer[3][];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Integer[3];
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i * j; // 自动装箱
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
}
