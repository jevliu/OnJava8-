import java.util.*;
/**
 * @author 刘季伟
 * @implNote 创建不规则数组
 * @since 2024/9/4 13:49:58
 */
public class RaggedArray {
    static int val = 1;

    public static void main(String[] args) {
        SplittableRandom rand = new SplittableRandom(47);
        // 三维不定长的矩阵
        int[][][] a = new int[rand.nextInt(7)][][];
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[rand.nextInt(5)][];
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = new int[rand.nextInt(5)];
                Arrays.setAll(a[i][j], n -> val++); // 使用生成器来生成插入数组中的值
            }
        }

        System.out.println(Arrays.deepToString(a));
    }
}
