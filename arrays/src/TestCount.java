import java.util.*;
import java.util.logging.SocketHandler;
import java.util.stream.*;
import onjava.*;
import static onjava.ArrayShow.*;
/**
 * @author 刘季伟
 * @implNote 测试Count类，展示如何具体使用
 * @since 2024/9/4 15:20:33
 */
public class TestCount {
    static final int SZ = 5;

    public static void main(String[] args) {
        System.out.println("Boolean");
        Boolean[] a1 = new Boolean[SZ];
        Arrays.setAll(a1, new Count.Boolean()::get);
        show(a1);
        System.out.println();
        a1 = Stream.generate(new Count.Boolean()).limit(SZ + 1).toArray(Boolean[]::new);
        show(a1);
        System.out.println();
        a1 = new Count.Boolean().array(SZ + 2);
        show(a1);
        System.out.println();
        boolean[] a1b = new Count.Pboolean().array(SZ + 3);
        show(a1b);

        System.out.println("Integer");
        int[] a5 = new int[SZ];
        Arrays.setAll(a5, new Count.Integer()::get);
        show(a5);
        System.out.println();
        Integer[] a5b = Stream.generate(new Count.Integer()).limit(SZ + 1).toArray(Integer[]::new);
        show(a5b);
        System.out.println();
        a5b = new Count.Integer().array(SZ + 2);
        show(a5b);
        System.out.println();
        a5 = IntStream.generate(new Count.Pint()).limit(SZ + 1).toArray();
        show(a5);
        System.out.println();

    }
}
