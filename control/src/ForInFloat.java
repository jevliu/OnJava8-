/**
 * @author 刘季伟
 * @implNote
 * @since 2024/4/16 09:29:38
 */
import java.util.*;
public class ForInFloat {
    public static void main(String[] args) {
        Random rand = new Random(47);
        float[] f = new float[10];
        for (int i = 0; i < 10; i++)
            f[i] = rand.nextFloat();
        for (float x : f)
            System.out.println(x);
    }
}
