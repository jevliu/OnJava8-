import java.time.Instant;
import java.util.*;
import java.util.logging.SocketHandler;
import java.util.stream.*;
import onjava.*;
import static onjava.ArrayShow.*;
/**
 * @author 刘季伟
 * @implNote 展示对Rand类的测试
 * @since 2024/9/4 18:51:36
 */
public class TestRand {
    static final int SZ = 5;

    public static void main(String[] args) {
        System.out.println("Boolean");
        Boolean[] a1 = new Boolean[SZ];
        Arrays.setAll(a1, new Rand.Boolean()::get);
        show(a1);
        System.out.println();
        a1 = Stream.generate(new Rand.Boolean()).limit(SZ + 1).toArray(Boolean[]::new);
        show(a1);
        System.out.println();
        a1 = new Rand.Boolean().array(SZ + 2);
        boolean[] a1b = new Rand.Pboolean().array(SZ + 3);
        show(a1b);
        System.out.println();

        System.out.println("Integer");
        int[] a5 = new int[SZ];
        Arrays.setAll(a5, new Rand.Integer()::get);
        show(a5);
        System.out.println();
        Integer[] a5b = Stream.generate(new Rand.Integer()).limit(SZ + 1).toArray(Integer[]::new);
        show(a5b);
        System.out.println();
        a5b = new Rand.Integer().array(SZ + 2);
        show(a5b);
        System.out.println();
        a5 = IntStream.generate(new Rand.Pint()).limit(SZ + 1).toArray();
        show(a5);
        System.out.println();
        a5 = new Rand.Pint().array(SZ + 3);
        show(a5);
    }
}
