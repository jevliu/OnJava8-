import java.util.*;
import onjava.*;
import static onjava.ArrayShow.*;
/**
 * @author 刘季伟
 * @implNote 数组元素修改
 * @since 2024/9/5 11:09:37
 */
public class ModifyExisting {
    public static void main(String[] args) {
        double[] da = new double[7];
        Arrays.setAll(da, new Rand.Double()::get);
    }
}
