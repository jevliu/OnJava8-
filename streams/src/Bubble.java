/**
 * @author 刘季伟
 * @implNote
 * @since 2024/6/24 15:17:19
 */
import java.util.function.*;

public class Bubble {
    public final int i;
    public Bubble(int n) { i = n; }
    @Override public String toString() {
        return "Bubble(" + i + ")";
    }
    private static int count = 0;
    // 包含了自己的静态生成器方法
    public static Bubble bubbler() {
        return new Bubble(count++);
    }
}
