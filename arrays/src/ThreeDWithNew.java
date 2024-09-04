import java.util.*;
/**
 * @author 刘季伟
 * @implNote 展示使用new表达式分配三维数组
 * @since 2024/9/4 13:47:36
 */
public class ThreeDWithNew {
    public static void main(String[] args) {
        // 创建一个三维定长的数组
        int[][][] a = new int[2][2][4];
        System.out.println(Arrays.deepToString(a));
    }
}
